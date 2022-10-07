package com.tengfei.minicord

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + "nice to meet you"
}

actual fun getPlatform(): Platform = IOSPlatform()