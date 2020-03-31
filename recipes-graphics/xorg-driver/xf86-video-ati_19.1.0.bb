require recipes-graphics/xorg-driver/xorg-driver-video.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=aabff1606551f9461ccf567739af63dc"

SUMMARY = "X.Org X server -- ATI Radeon video driver"

DESCRIPTION = "Open-source X.org graphics driver for ATI Radeon graphics"

DEPENDS += "virtual/libx11 libxvmc drm \
            virtual/libgl xorgproto libpciaccess"

inherit features_check
REQUIRED_DISTRO_FEATURES += "opengl"

SRC_URI[md5sum] = "6e49d3c2839582af415ceded76e626e6"
SRC_URI[sha256sum] = "659f5a1629eea5f5334d9b39b18e6807a63aa1efa33c1236d9cc53acbb223c49"

RDEPENDS_${PN} += "xserver-xorg-module-exa"
RRECOMMENDS_${PN} += "linux-firmware-radeon"

FILES_${PN} += "${datadir}/X11"
