SUMMARY = "Custom image containing required packages"
DESCRIPTION = "Custom image containing required packages. created 17-09-2020"

# based on core image minimal
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    util-linux \
    openssh \
    myshell \
    libstdc++ \
    wpa-supplicant \
    linux-firmware-rpidistro-bcm43430 \
    iw \
"

IMAGE_FEATURES += "package-management"
PACKAGE_CLASSES ?= "rpm deb package_deb"
