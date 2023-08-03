.\keytool.exe -genkeypair -alias apiEncryptionKey -keyalg RSA -dname "CN=Kenneth Lee, OU=API Development, O=joneconsulting.co.kr, L=Seoul, C=KR" -keypass "1q2w3e4r" -keystore apiEncryptionKey.jks -storepass "1q2w3e4r"


.\keytool.exe -list -keystore 'C:\workspace\spring-boot\spring-cloud-msa\e-commerce\keystore\apiEncryptionKey.jks'



.\keytool.exe -export -alias apiEncryptionKey -keystore 'C:\workspace\spring-boot\spring-cloud-msa\e-commerce\keystore\apiEncryptionKey.jks' -rfc -file trustServer.cer


.\keytool.exe -import -alias trustServer -file .\trustServer.cer -keystore publicKey.jks