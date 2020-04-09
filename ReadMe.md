
#解决chrome无法访问6000等端口问题

## zuul6000的微服务的端口是6000一直服务正常启动，但是利用浏览器访问一直无响应，结果换用postman可以正常访问，尴尬
##查阅各资料结果尴尬了，浏览器对特定的端口有限制。

Chrome，Firfox以下端口的web站点无法访问，所以在配置自己站点时需避开以下端口：
// tcpmux 7, // echo 9, // discard 11, // systat 13, // daytime 15, // netstat 17, // qotd 19, // chargen 20, // ftp data 21, // ftp access 22, // ssh 23, // telnet 25, // smtp 37, // time 42, // name 43, // nicname 53, // domain 77, // priv-rjs 79, // finger 87, // ttylink 95, // supdup 101, // hostriame 102, // iso-tsap 103, // gppitnp 104, // acr-nema 109, // pop2 110, // pop3 111, // sunrpc 113, // auth 115, // sftp 117, // uucp-path 119, // nntp 123, // NTP 135, // loc-srv /epmap 139, // netbios 143, // imap2 179, // BGP 389, // ldap 465, // smtp+ssl 512, // print / exec 513, // login 514, // shell 515, // printer 526, // tempo 530, // courier 531, // chat 532, // netnews 540, // uucp 556, // remotefs 563, // nntp+ssl 587, // stmp? 601, // ?? 636, // ldap+ssl 993, // ldap+ssl 995, // pop3+ssl 2049, // nfs 4045, // lockd 6000, // X11