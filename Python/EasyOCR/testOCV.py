import cv2
import os
# from matplotlib import pyplot as plt
import numpy as np
import re
import imutils
import easyocr

def ReadLicensePlates():
    cap = cv2.VideoCapture(0)
    while (True):
        # Capture frame-by-frame
        ret, frame = cap.read()
        # Display the resulting frame
        cv2.imshow('frame', frame)
        if cv2.waitKey(25) & 0xFF == ord('p'):
            # save image
            cv2.imwrite("temp.jpg", frame)
            # Read image
            img = cv2.imread(r'temp.jpg')
            reader = easyocr.Reader(['en'])
            result = reader.readtext(img)
            print(result)
            soLuong = result.__len__()
            if (soLuong > 2):
                text = result[1][1] + result[2][1]
            else:
                text = result[0][1] + result[1][1]

            fresult = re.sub('[^A-Za-z0-9 ]+', '', text)
            print(fresult)
            # os.remove("temp.jpg")
        if cv2.waitKey(25) & 0xFF == ord('q'):

            break
    # When everything done, release the capture
    cap.release()
    cv2.destroyAllWindows()


ReadLicensePlates()


