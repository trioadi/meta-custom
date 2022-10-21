SUMMARY = "test app"
DESCRIPTION = "Custom recipe to build app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#location source files (local, github or other)
SRC_URI = "file://src"

#download dir source file
S = "${WORKDIR}/src"

#Pass arguments to linker
TARGET_CC_ARCH += "${LDFLAGS}"

# cross compile source code
do_compile(){
  ${CC} -o mytesapp mytesapp.c
}

#create /usr/bin in rootfs and copy program to it
do_install(){
  install -d ${D}${bindir}
  install -m 0755 mytesapp ${D}${bindir}
}

