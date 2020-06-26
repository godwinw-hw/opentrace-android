package io.bluetrace.opentrace.services

import com.huawei.agconnect.config.AGConnectServicesConfig
import com.huawei.hms.aaid.HmsInstanceId
import com.huawei.hms.push.HmsMessageService
import com.huawei.hms.push.RemoteMessage

class HMSPushService : HmsMessageService() {

    // push token will be returned to this service for devices running EMUI 9 and below
    override fun onNewToken(pushToken: String?) {
        super.onNewToken(pushToken)

        // this function will return the push token and can be accessed on any context based class (Activity, fragment, etc).
        // however the method below requires minimum version of EMUI 10.
        val huaweiAppId = AGConnectServicesConfig.fromContext(this).getString("client/app_id")
        val huaweiPushToken = HmsInstanceId.getInstance(this).getToken(huaweiAppId, "HCM")

    }

    // function that will receive Data message sent from server
    override fun onMessageReceived(msg: RemoteMessage?) {
        super.onMessageReceived(msg)
    }
}