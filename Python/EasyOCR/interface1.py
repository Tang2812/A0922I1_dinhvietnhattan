from PyQt6 import QtCore, QtGui, QtWidgets


class Ui_MainWindow(object):
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(693, 514)
        MainWindow.setLayoutDirection(QtCore.Qt.LayoutDirection.LeftToRight)
        MainWindow.setStyleSheet("\n"
                                 "background-color: #fff;\n"
                                 "\n"
                                 "")
        self.centralwidget = QtWidgets.QWidget(parent=MainWindow)
        self.centralwidget.setStyleSheet("\n"
                                         "#headerL,#headerR {\n"
                                         "background-color: #00a08b;\n"
                                         "color:#fff;\n"
                                         "font-weight:900;\n"
                                         "font-size:12px;\n"
                                         "border-radius:5px;\n"
                                         "}\n"
                                         "QLabel{\n"
                                         "font-size:10px;\n"
                                         "background-color: #fff;\n"
                                         "color:#00a08b;\n "
                                         "font-weight:700;\n"
                                         "}\n"
                                         "QListWidget{\n"
                                         "border-radius:3px;\n"
                                         "border:1px solid  rgb(94, 94, 94);\n"
                                         "background-color: #fff ;\n"

                                         "}\n"
                                         "QListWidget:hover{\n"
                                         "border-color:#00a08b;\n"
                                         "}\n"
                                         "QGraphicsView{\n"
                                         "border-radius:3px;\n"
                                         "border: 1px solid #808080;\n "
                                         "}"


                                         "QPushButton{\n"
                                         "border-radius:3px;\n"
                                         "color:#fff;\n"
                                         "font-weight:500;\n"
                                         "}"
                                         "#result{\n"
                                         "background-color: #03a84e ;\n"
                                         "}"
                                         )
        self.centralwidget.setObjectName("centralwidget")
        self.verticalLayout_4 = QtWidgets.QVBoxLayout(self.centralwidget)
        self.verticalLayout_4.setContentsMargins(0, 0, 0, 0)
        self.verticalLayout_4.setSpacing(0)
        self.verticalLayout_4.setObjectName("verticalLayout_4")
        self.frame_4 = QtWidgets.QFrame(parent=self.centralwidget)
        self.frame_4.setMinimumSize(QtCore.QSize(0, 0))
        self.frame_4.setStyleSheet("")
        self.frame_4.setFrameShape(QtWidgets.QFrame.Shape.StyledPanel)
        self.frame_4.setFrameShadow(QtWidgets.QFrame.Shadow.Raised)
        self.frame_4.setObjectName("frame_4")
        self.horizontalLayout = QtWidgets.QHBoxLayout(self.frame_4)
        self.horizontalLayout.setContentsMargins(0, 0, 0, 0)
        self.horizontalLayout.setSpacing(0)
        self.horizontalLayout.setObjectName("horizontalLayout")
        self.lb_nameApp = QtWidgets.QLabel(parent=self.frame_4)
        sizePolicy = QtWidgets.QSizePolicy(QtWidgets.QSizePolicy.Policy.Preferred,
                                           QtWidgets.QSizePolicy.Policy.Expanding)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(self.lb_nameApp.sizePolicy().hasHeightForWidth())
        self.lb_nameApp.setSizePolicy(sizePolicy)
        font = QtGui.QFont()
        font.setPointSize(-1)
        font.setBold(True)
        font.setWeight(99)
        self.lb_nameApp.setFont(font)
        self.lb_nameApp.setStyleSheet("font-size:30px;\n"
                                      "color:#00a08b;\n"
                                      "font-weight:1200;\n"
                                      "")
        self.lb_nameApp.setObjectName("lb_nameApp")
        self.horizontalLayout.addWidget(self.lb_nameApp)
        self.pushButton_3 = QtWidgets.QPushButton(parent=self.frame_4)
        self.pushButton_3.setStyleSheet("")
        self.pushButton_3.setText("")
        icon = QtGui.QIcon()
        icon.addPixmap(QtGui.QPixmap("icon/car4.png"), QtGui.QIcon.Mode.Normal, QtGui.QIcon.State.Off)
        self.pushButton_3.setIcon(icon)
        self.pushButton_3.setIconSize(QtCore.QSize(35, 35))
        self.pushButton_3.setObjectName("pushButton_3")
        self.horizontalLayout.addWidget(self.pushButton_3)
        self.verticalLayout_4.addWidget(self.frame_4, 0, QtCore.Qt.AlignmentFlag.AlignHCenter)
        self.verticalLayout_4.addSpacing(50)
        self.frame_3 = QtWidgets.QFrame(parent=self.centralwidget)
        self.frame_3.setFrameShape(QtWidgets.QFrame.Shape.StyledPanel)
        self.frame_3.setFrameShadow(QtWidgets.QFrame.Shadow.Raised)
        self.frame_3.setObjectName("frame_3")
        self.horizontalLayout_2 = QtWidgets.QHBoxLayout(self.frame_3)
        self.horizontalLayout_2.setObjectName("horizontalLayout_2")
        self.frame_2 = QtWidgets.QFrame(parent=self.frame_3)
        self.frame_2.setMaximumSize(QtCore.QSize(250, 16777215))
        self.frame_2.setFrameShape(QtWidgets.QFrame.Shape.StyledPanel)
        self.frame_2.setFrameShadow(QtWidgets.QFrame.Shadow.Raised)
        self.frame_2.setObjectName("frame_2")
        self.verticalLayout_2 = QtWidgets.QVBoxLayout(self.frame_2)
        self.verticalLayout_2.setContentsMargins(0, 9, 0, 90)
        self.verticalLayout_2.setSpacing(2)
        self.verticalLayout_2.setObjectName("verticalLayout_2")
        self.headerR = QtWidgets.QLabel(parent=self.frame_2)
        self.headerR.setMinimumSize(QtCore.QSize(200, 35))
        self.headerR.setMaximumSize(QtCore.QSize(16777215, 35))
        self.headerR.setLayoutDirection(QtCore.Qt.LayoutDirection.LeftToRight)
        self.headerR.setAutoFillBackground(False)
        self.headerR.setStyleSheet("")
        self.headerR.setTextFormat(QtCore.Qt.TextFormat.AutoText)
        self.headerR.setScaledContents(False)
        self.headerR.setAlignment(QtCore.Qt.AlignmentFlag.AlignCenter)
        self.headerR.setWordWrap(False)
        self.headerR.setTextInteractionFlags(QtCore.Qt.TextInteractionFlag.LinksAccessibleByMouse)
        self.headerR.setObjectName("headerR")
        self.verticalLayout_2.addWidget(self.headerR)
        self.lb_ID = QtWidgets.QLabel(parent=self.frame_2)
        self.lb_ID.setObjectName("lb_ID")

        self.verticalLayout_2.addWidget(self.lb_ID, 0, QtCore.Qt.AlignmentFlag.AlignBottom)
        self.ID = QtWidgets.QListWidget(parent=self.frame_2)
        self.ID.setMaximumSize(QtCore.QSize(16777215, 30))
        self.ID.setObjectName("ID")
        self.verticalLayout_2.addWidget(self.ID)
        self.lb_owner = QtWidgets.QLabel(parent=self.frame_2)
        self.lb_owner.setObjectName("lb_owner")
        self.verticalLayout_2.addWidget(self.lb_owner, 0, QtCore.Qt.AlignmentFlag.AlignBottom)
        self.ownerName = QtWidgets.QListWidget(parent=self.frame_2)
        self.ownerName.setMaximumSize(QtCore.QSize(16777215, 30))
        self.ownerName.setObjectName("ownerName")
        self.verticalLayout_2.addWidget(self.ownerName)
        self.lb_typeV = QtWidgets.QLabel(parent=self.frame_2)
        self.lb_typeV.setObjectName("lb_typeV")
        self.verticalLayout_2.addWidget(self.lb_typeV, 0, QtCore.Qt.AlignmentFlag.AlignBottom)
        self.typeV = QtWidgets.QListWidget(parent=self.frame_2)
        self.typeV.setMaximumSize(QtCore.QSize(16777215, 30))
        self.typeV.setObjectName("typeV")
        self.verticalLayout_2.addWidget(self.typeV)
        self.lb_licensePlate = QtWidgets.QLabel(parent=self.frame_2)
        self.lb_licensePlate.setObjectName("lb_licensePlate")
        self.verticalLayout_2.addWidget(self.lb_licensePlate, 0, QtCore.Qt.AlignmentFlag.AlignBottom)
        self.Barcode = QtWidgets.QListWidget(parent=self.frame_2)
        self.Barcode.setMaximumSize(QtCore.QSize(16777215, 30))
        self.Barcode.setObjectName("Barcode")
        self.verticalLayout_2.addWidget(self.Barcode)
        self.widget = QtWidgets.QWidget(parent=self.frame_2)
        self.widget.setMinimumSize(QtCore.QSize(0, 100))
        self.widget.setObjectName("widget")
        self.verticalLayout_2.addWidget(self.widget)
        self.horizontalLayout_2.addWidget(self.frame_2)
        self.line = QtWidgets.QFrame(parent=self.frame_3)
        self.line.setMinimumSize(QtCore.QSize(2, 0))
        self.line.setFrameShape(QtWidgets.QFrame.Shape.VLine)
        self.line.setFrameShadow(QtWidgets.QFrame.Shadow.Sunken)
        self.line.setObjectName("line")
        self.horizontalLayout_2.addWidget(self.line)
        self.frame = QtWidgets.QFrame(parent=self.frame_3)
        self.frame.setFrameShape(QtWidgets.QFrame.Shape.StyledPanel)
        self.frame.setFrameShadow(QtWidgets.QFrame.Shadow.Raised)
        self.frame.setObjectName("frame")
        self.verticalLayout_3 = QtWidgets.QVBoxLayout(self.frame)
        self.verticalLayout_3.setObjectName("verticalLayout_3")
        self.headerL = QtWidgets.QLabel(parent=self.frame)
        self.headerL.setMinimumSize(QtCore.QSize(350, 35))
        font = QtGui.QFont()
        font.setPointSize(-1)
        font.setBold(True)
        font.setWeight(62)
        self.headerL.setFont(font)
        self.headerL.setStyleSheet("")
        self.headerL.setTextFormat(QtCore.Qt.TextFormat.AutoText)
        self.headerL.setScaledContents(False)
        self.headerL.setAlignment(QtCore.Qt.AlignmentFlag.AlignCenter)
        self.headerL.setObjectName("headerL")
        self.verticalLayout_3.addWidget(self.headerL)
        # self.lb_licensePlateC = QtWidgets.QLabel(parent=self.frame)
        # self.lb_licensePlateC.setStyleSheet("margin-top:10px;")
        # self.lb_licensePlateC.setObjectName("lb_licensePlateC")
        # self.verticalLayout_3.addWidget(self.lb_licensePlateC)
        # self.licensePlateC = QtWidgets.QListWidget(parent=self.frame)
        # self.licensePlateC.setMinimumSize(QtCore.QSize(200, 0))
        # self.licensePlateC.setMaximumSize(QtCore.QSize(16777215, 30))
        # self.licensePlateC.setObjectName("licensePlateC")
        # self.verticalLayout_3.addWidget(self.licensePlateC)
        # self.lb_BarCodeC = QtWidgets.QLabel(parent=self.frame)
        # self.lb_BarCodeC.setStyleSheet("margin-top:10px;")
        # self.lb_BarCodeC.setObjectName("lb_BarCodeC")
        # self.verticalLayout_3.addWidget(self.lb_BarCodeC)
        # self.barcodeC = QtWidgets.QListWidget(parent=self.frame)
        # self.barcodeC.setMinimumSize(QtCore.QSize(0, 0))
        # self.barcodeC.setMaximumSize(QtCore.QSize(16777215, 30))
        # self.barcodeC.setObjectName("barcodeC")
        # self.verticalLayout_3.addWidget(self.barcodeC)
        # self.lb_typeVC = QtWidgets.QLabel(parent=self.frame)
        # self.lb_typeVC.setStyleSheet("margin-top:10px;")
        # self.lb_typeVC.setObjectName("lb_typeVC")
        # self.verticalLayout_3.addWidget(self.lb_typeVC)
        # self.typeVC = QtWidgets.QListWidget(parent=self.frame)
        # self.typeVC.setMaximumSize(QtCore.QSize(16777215, 30))
        # self.typeVC.setObjectName("typeVC")
        # self.verticalLayout_3.addWidget(self.typeVC)
        self.lb_graphicsView = QtWidgets.QLabel(parent=self.frame)
        self.lb_graphicsView.setStyleSheet("margin-top:10px;")
        self.lb_graphicsView.setObjectName("lb_graphicsView")
        self.verticalLayout_3.addWidget(self.lb_graphicsView)
        self.frame_5 = QtWidgets.QFrame(parent=self.frame)
        self.frame_5.setFrameShape(QtWidgets.QFrame.Shape.StyledPanel)
        self.frame_5.setFrameShadow(QtWidgets.QFrame.Shadow.Raised)
        self.frame_5.setObjectName("frame_5")
        self.horizontalLayout_5 = QtWidgets.QHBoxLayout(self.frame_5)
        self.horizontalLayout_5.setObjectName("horizontalLayout_5")
        #Man hinh cam trai
        self.graphicsView = QtWidgets.QGraphicsView(parent=self.frame_5)
        self.graphicsView.setObjectName("graphicsView")
        #Man hinh cam phai
        self.horizontalLayout_5.addWidget(self.graphicsView)
        self.graphicsView_2 = QtWidgets.QGraphicsView(parent=self.frame_5)
        self.graphicsView_2.setObjectName("graphicsView_2")
        self.horizontalLayout_5.addWidget(self.graphicsView_2)
        self.verticalLayout_3.addWidget(self.frame_5)
        self.lb_result = QtWidgets.QLabel(parent=self.frame)
        self.lb_result.setObjectName("lb_result")
        self.verticalLayout_3.addWidget(self.lb_result)
        self.result = QtWidgets.QPushButton(parent=self.frame)
        self.result.setMinimumSize(QtCore.QSize(0, 30))
        font = QtGui.QFont()
        font.setPointSize(12)
        font.setBold(True)
        font.setWeight(62)
        self.result.setFont(font)

        self.result.setObjectName("result")
        self.verticalLayout_3.addWidget(self.result)
        self.horizontalLayout_2.addWidget(self.frame)
        self.verticalLayout_4.insertWidget(1, self.frame_3)  # Di chuyển frame_3 lên trên
        MainWindow.setCentralWidget(self.centralwidget)
        self.statusbar = QtWidgets.QStatusBar(parent=MainWindow)
        self.statusbar.setObjectName("statusbar")
        MainWindow.setStatusBar(self.statusbar)

        self.retranslateUi(MainWindow)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)

    def retranslateUi(self, MainWindow):
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate("MainWindow", "MainWindow"))
        self.lb_nameApp.setText(_translate("MainWindow", "Automatic Parking Application"))
        self.headerR.setText(_translate("MainWindow", " THÔNG TIN ĐĂNG KÝ XE "))
        self.lb_ID.setText(_translate("MainWindow", "ID"))
        self.lb_owner.setText(_translate("MainWindow", "Tên chủ xe"))
        self.lb_typeV.setText(_translate("MainWindow", "Loại xe"))
        self.lb_licensePlate.setText(_translate("MainWindow", "Biển số xe"))
        self.headerL.setText(_translate("MainWindow", "THÔNG TIN  KIỂM TRA"))
        # self.lb_licensePlateC.setText(_translate("MainWindow", "Biển số trên xe"))
        # self.lb_BarCodeC.setText(_translate("MainWindow", "Biển số khi quét mã vạch"))
        # self.lb_typeVC.setText(_translate("MainWindow", "Loại xe"))
        self.lb_graphicsView.setText(_translate("MainWindow", "Hình ảnh"))
        self.lb_result.setText(_translate("MainWindow", "KẾT QUẢ"))
        self.result.setText(_translate("MainWindow", "True"))


if __name__ == "__main__":
    import sys

    app = QtWidgets.QApplication(sys.argv)
    MainWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow()
    ui.setupUi(MainWindow)
    MainWindow.setFixedSize(900, 600)
    MainWindow.show()
    sys.exit(app.exec())
