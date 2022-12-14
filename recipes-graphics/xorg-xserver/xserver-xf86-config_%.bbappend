FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:rpi = " \
    file://xorg.conf.d/99-calibration.conf \
"
do_install:append() {
	install -d ${D}/${sysconfdir}/X11/xorg.conf.d/
	install -m 0644 ${WORKDIR}/xorg.conf.d/99-calibration.conf ${D}/${sysconfdir}/X11/xorg.conf.d/
	install -d ${D}/${sysconfdir}/X11/
	install -m 0644 ${WORKDIR}/xorg.conf ${D}/${sysconfdir}/X11/
}

FILES_${PN} += "/etc/X11/"
