package com.betty.listview.data

import com.betty.listview.model.Mail

class Datasource {
    fun loadMails(): List<Mail> {
        return listOf(
            Mail("Dậy đi ", "12:34 AM", "gnudhnim@gmail.com"),
            Mail(
                "bây h là mấy giờ rồi",
                "11:34 PM",
                "hust@edu.com"
            ),
            Mail("ngay mai học android", "09:15 AM", "boss@company.com"),
            Mail("lập trình mạng", "01:20 PM", "friend@example.com"),
            Mail("Chương trình dịch", "03:45 PM", "social@network.com"),
            Mail("facebook sign in verified", "05:55 PM", "recruitment@techco.com"),
            Mail("Hủy chuyến", "10:10 AM", "hmmm@adventure.com"),
            Mail("Đặt vé thành công", "6:40 PM", "7kem10@adventure.com"),
            Mail("Đăng ký tài khoản thành công", "1:12 PM", "huhuhu@adventure.com"),
        )
    }
}