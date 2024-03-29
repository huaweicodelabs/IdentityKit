# Huawei Identity Demo

The demo App demonstrates Huawei Identity client APIs and usages. 

Documentation can be found at this 

[link](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/introduction-0000001050040471).


## Table Of Content

- [Introduction](#introduction)
- [Getting Started](#Getting-Started)
- [Enviroment requirement](#enviroment-requirement)
  - [develop requirement](#develop-requirement)
  - [Runtime requirement](#runtime-requirement)
- [Installation](#installation)
- [Configuration](#configuration)
- [Tutorial](#tutorial)
- [Code Examples](#code-examples)
- [License](#license)  


## Introduction

The demo implements the HUAWEI Identity API to obtain the user address interface, and assembles and returns the selected address information to the interface.

## Getting Started

    1. Register as a developer.
    Register a [HUAWEI account](https://developer.huawei.com/consumer/en/).
    2. Create an app.
    Create an app and enable APIs.
    3. Build the demo.
    To build this demo, please first import the demo to Android Studio (3.X or later). Then download the agconnect-services.json file of the app from AppGallery Connect, and add the file to the app directory (\app) of the demo. For details, please refer to [Preparations for Integrating HUAWEI HMS Core](https://developer.huawei.com/consumer/en/codelab/HMSPreparation/index.html)

## Enviroment requirement

### Develop requirement

To be able to develop, build and debug this demo, you will need at least the following environment:

* a connection to Internet, for downloading package dependencies form Huawei and Google

* a compatible IDE, Android Studio is recommended.

* a gradle installation will be downloaded when you use command line gradle wrapper or 
    open downloaded folder in compatible IDE

* an Android SDK installation, API version 28 or above is recommended.

### Runtime requirement

To be able to run this demo, you will need an Android device with EMUI 3.0 or above, 
Android 4.4 and above, with Huawei Mobile Service (HMS) pre-installed.

If the HMS is missing, the device will prompt you to install or upgrade HMS first on calling Identity SDK.


## Installation

1. Clone or download this project and open the downloaded folder in Android Studio or compatible IDE.

2. use IDE's functionality to install configured project on to your device.


## Tutorial

1. Once you start the demo, you should be able to see the following page.
<img src="images/en-us_image_0210355807.png" alt="mainpage" height="600"/>

2. Click to **get Huawei User Address** button. After selecting the specific address, click OK. The following result will be displayed.
<img src="images/en-us_image_0210355809.png" alt="resultpage" height="600"/>


## Code Examples

### Obtaining a User Address

1. Instantiate the request object by using the **new UserAddressRequest** method. Then, call the **getUserAdddress** API.
   The code location is in the getUserAddress method in the src/app/src/main/java/com/huawei/demo/identitydemo/MainActivity.java file.

2. Display the address selection page by calling the **startActivityResult** method of **Status**.
   The code location is in the startActivityForResult method in the src/app/src/main/java/com/huawei/demo/identitydemo/MainActivity.java file.

3. After the user selects an address, call the **parseIntent** method of **UserAddress** in **onActivityResult** of the page and obtain the address from the returned result.
   The code location is in the onActivityResult method in the src/app/src/main/java/com/huawei/demo/identitydemo/MainActivity.java file.


## License

This demo is licensed under the [Apache License, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
