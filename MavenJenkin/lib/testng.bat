set projectLocation=C:\Test Automation Training\Training Projects\automation-training-se\MavenJenkin
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause