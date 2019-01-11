<img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/futuretrust.jpg" width="300" alt="FutureTrust">

FutureTrust aims at supporting the practical implementation of electronic identification (eID) services in Europe and beyond. It addresses the need for globally interoperable solutions through basic research with respect to the foundations of trust and trustworthiness, supports the standardisation process in relevant areas, and provides Open Source software components which will ease the use of eID in real world applications. More information can be found on our official webiste: https://www.futuretrust.eu.

The present website provides an overview of our contributions regarding the security of eID services and **invites further stakeholders to contribute to this research.** 

The project is funded within the EU Framework Programme for Research and Innovation (Horizon 2020) under Grant Agreement No. 700542.


# Overview of eID Services

Our first contribution is the documentation of existing governmental and commercial eID services. It investigates the usage of authentication schemes and protocols and their security properties. In particular, it concentrates on three major protocols: SAML, OpenID, and OpenID Connect. It shows how these protocols are used in different countries, which authentication methods are used, and how the issued authentication tokens are transported over secure channels.

Information about the existing eID services were collected from whitepapers and scientific publications as well as with custom tools. Countries from the European Union, European Economic Area (Norway, Iceland, Liechtenstein), and other countries applying eID protocols were considered in our analysis.

**See the [FutureTrust Wiki](https://github.com/RUB-NDS/FutureTrust/wiki) for the online documentation.**

# Evaluation of eID and Trust Services
eID services are based on well-established web technologies. These technologies provide functionalities for secure browsing, login mechanisms, Single Sign-On, or exchanging confidential data over untrusted networks. Unfortunately, these technologies are also common targets of attacks if they are misconfigured or incorrectly implemented. In recent years, it has been shown how to break SAML-based SSO systems and login as an arbitrary user, read arbitrary files from SAML servers, or how to break XML Encryption and decrypt the exchanged SAML assertions. These attacks present serious threats to the eID users and their prevention is, therefore, of high importance.

The goal of this document is to provide an overview of the attacks relevant to eID scenarios and to summarize security guidelines and best practices for the deployment of secure eID infrastructures based on SAML.
We first give an overview of the technologies used in eID services and present the main security features provided by these technologies. Afterwards, we provide an architecture description of a typical SSO provider, describe generic attacks, and describe the attack scenarios applicable on this architecture. We summarize security evaluations that should be performed when analyzing the security of a deployed SAML-based SSO provider. These attacks range from targeting the underlying TLS protocol and XML parser (XXE attacks), to exploiting incorrect XML Signature validation that can allow an attacker to log in as an arbitrary user. Based on the summarized attacks, we define best security practices to deploy SAML-based eID systems. This provides an overview of the relevant countermeasures and reference security documents written by well-established entities like OWASP (Open Web Application Security Project) or BSI (Bundesamt für Sicherheit in der Informationstechnik).

In order to support eID developers in their secure development process, we also extended the tool Extension for Processing and Recognition of Single SignOn Protocols (EsPReSSO), which helps to analyze different SSO protocols and their used information flow. We implemented a prototype of the summarized SAML-relevant attacks into EsPReSSO so that eID developers are able to check for known vulnerabilities. The tool will provide recommendations for developers to enhance the security of deployed eID systems.

# FutureTrust Partners

<a href="https://www.ruhr-uni-bochum.de" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/rub.png" width="50" alt="FutureTrust"></a>
<a href="https://www.ecsec.de/startseite/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/ecsec.png" width="50" alt="FutureTrust"></a>
<a href="https://www.arhs-group.com/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/arhs.png" width="50" alt="FutureTrust"></a>
<a href="https://www.eema.org/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/eema.png" width="50" alt="FutureTrust"></a>
<a href="https://en.brz.gv.at/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/brz.png" width="50" alt="FutureTrust"></a>
<a href="https://www.bva.bund.de/DE/Home/home_node.html" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/bva.png" width="50" alt="FutureTrust"></a>
<a href="https://www.pwc.com/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/pwc.png" width="50" alt="FutureTrust"></a>
<a href="https://www.southampton.ac.uk/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/soton.png" width="50" alt="FutureTrust"></a>
<a href="https://www.multicert.com/en/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/multicert.png" width="50" alt="FutureTrust"></a>
<a href="http://www.trustable.de/index_en.html" target="http://www.trustable.de/"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/trust.png" width="50" alt="FutureTrust"></a>
<a href="https://www.a-sit.at/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/asit.png" width="50" alt="FutureTrust"></a>
<a href="https://sda.gov.ge/?lang=en" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/psda.jpg" width="50" alt="FutureTrust"></a>
<a href="https://www.tubitak.gov.tr/en" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/tubitak.png" width="50" alt="FutureTrust"></a>
<a href="https://www.lawtrust.co.za/" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/lawtrust.jpg" width="50" alt="FutureTrust"></a>
<a href="http://www.mup.gov.rs/wps/portal/en" target="_blank"><img src="https://github.com/RUB-NDS/FutureTrust/blob/master/images/mup.png" width="50" alt="FutureTrust"></a>
