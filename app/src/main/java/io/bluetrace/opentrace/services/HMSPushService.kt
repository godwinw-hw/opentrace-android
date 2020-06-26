package io.bluetrace.opentrace.services

import com.huawei.hms.push.HmsMessageService
import com.huawei.hms.push.RemoteMessage

class HMSPushService : HmsMessageService() {

    // push token will be returned to this service for devices running EMUI 9 and below
    override fun onNewToken(pushToken: String?) {
        super.onNewToken(pushToken)


    }

    // function that will receive Data message sent from server
    override fun onMessageReceived(msg: RemoteMessage?) {
        super.onMessageReceived(msg)
    }
}