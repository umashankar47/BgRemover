#  AI Background Remover

A Java-based tool that automates background removal using Microsoft Designer's API. This project reverse-engineers the API calls and allows users to process images Quickly and in High Quality by configuring few elements, Avoiding the hassle of clunky UI.


## Features

- Removes backgrounds from images using MS Designer's API.

- Users can configure config.properties to set the input folder, image name, and output folder.

- Requires bearer token and session ID, obtained from the official MS Designer Developer Tools.

- Maven-based Java project for easy dependency management.


## Deployment

### Prerequisites

Java 18

Maven

An account on MS Designer

### Clone the repo


```bash

git clone https://github.com/yourusername/your-repo-name.git

cd your-repo-name
```

## Configuration

```bash
sessionId=

authToken=

outputFolder=E:/APIBGMS/download/

inputFolder=E:/APIBGMS/upload/

fileName=rubik.jpg

removeBGAPI=https://designerapp.officeapps.live.com/designerapp/imagetransformation.ashx

dChint=IndiaCentral
#IndiaCentral,KoreaCentral,JapanEast,

uploadUrl=https://userassets.designerapp.officeapps.live.com/designerapp/userasset.ashx?action=upload&name=1713098017993.jpeg&type=Image&sequenceId=0&userID=

#you can use random UUID
fileToken=

```


## Get The Key
1. Login to your Microsoft Designer account
2. Open browser developer tools (F12) and go to Network tab
3. Go to generate an image or edit 
4. In the Network tab, find the POST request to any call ending with .ashx
5. Find *authentication* token and *sessionId*




![image](https://github.com/user-attachments/assets/a758685d-9877-4b7c-bade-44d8e7560845)

### Before
![rubik](https://github.com/user-attachments/assets/b9b12d7a-0a92-4118-b09d-3f3c1cb3b7c9)

### After
![rubik](https://github.com/user-attachments/assets/6879261c-6d67-4308-9120-9105487252f7)



