include recipes-core/images/rpi-basic-image.bb

IMAGE_INSTALL += " \
	myshell \
        wpa-supplicant \
        linux-firmware-rpidistro-bcm43430 \
        iw \
	"
