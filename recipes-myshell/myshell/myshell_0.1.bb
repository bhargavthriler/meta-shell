SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e0eb429dbab531d0874038360a879b9"

#SRCREV = "ce92f43aea4f5ea32858892f446084ea9f2b2a7f"
SRCREV = "e6562bf2ee2421973c14fac3a4e3a7489db98da3"
SRC_URI = "git://github.com/bhargavthriler/simple_shell.git"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/"  

#do_compile() {
#	make
#}

#inherit autotools

#TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 hello_shell ${D}${bindir}
}
