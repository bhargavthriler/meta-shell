SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e0eb429dbab531d0874038360a879b9"

SRCREV = "17cccb533394f665dacf2a46ec5254ae18860d63"
SRC_URI = "git://github.com/bhargavthriler/simple_shell.git"

S = "${WORKDIR}/git"

do_compile() {
	${CC} -o myshell main.c
}

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 myshell ${D}${bindir}
}
