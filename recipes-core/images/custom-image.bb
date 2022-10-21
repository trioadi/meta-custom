
SUMMARY = "Test Custom Linux image"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit extrausers

#change size rootfs
IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "102400"

#change root password
PASSWD = "\$5\$mEcsj/SXRL0zKF\$fbdA6U3yO9RiHVUz31CIDW7nHke2ktBzD0zb2kiHHtB"
EXTRA_USERS_PARAMS = "\
  usermod -p '${PASSWD}' root; \
  "
#include our cutom app
IMAGE_INSTALL += "mytesapp"

#HDMI_FORCE_HOTPLUG = "1"
#HDMI_GROUP = "2"
#ENABLE_UART = "1"
#ENABLE_SPI_BUS = "1"

IMAGE_FEATURES:append = " ssh-server-dropbear"

IMAGE_INSTALL:append = " kernel-modules xserver-xorg xserver-xf86-config xterm xf86-input-evdev raspi2fb xf86-video-fbdev xinput-calibrator gpsd switch-fbdevice"
