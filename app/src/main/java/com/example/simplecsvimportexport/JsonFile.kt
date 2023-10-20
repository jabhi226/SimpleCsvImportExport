package com.example.simplecsvimportexport

import com.google.gson.Gson
import org.json.JSONArray

object JsonFile {
    fun getDummyData(): List<CsvExampleItem> {
        val json = JSONArray(getDummyJsonFileString())
        val list = ArrayList<CsvExampleItem>()
        for (i in 0 until json.length()) {
            val item = Gson().fromJson(json[i].toString(), CsvExampleItem::class.java)
            list.add(item)
        }
        return list
    }

    fun getDummyJsonFileString(): String {
        return "[ { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"40040MIG\", \"Batch_number\": \"SPF231065\", \"Expiry\": \"05/25\", \"cost_price\": 89.24, \"MRP\": 115, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0400400003\", \"order_item_id\": \"001182482023O10MS\", \"cgst_value\": 6.16, \"sgst_value\": 6.16, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 12.32, \"amount\": 115, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"74525MIG\", \"Batch_number\": \"22S1GTB734\", \"Expiry\": \"11/24\", \"cost_price\": 25.19, \"MRP\": 81, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0745250003\", \"order_item_id\": \"001182482023O16MS\", \"cgst_value\": 4.34, \"sgst_value\": 4.34, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 8.68, \"amount\": 81, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"5141MIG\", \"Batch_number\": \"*SN30228\", \"Expiry\": \"01/26\", \"cost_price\": 80.42, \"MRP\": 116.36, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0051410009\", \"order_item_id\": \"001182482023O1MS\", \"cgst_value\": 6.23, \"sgst_value\": 6.23, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 12.46, \"amount\": 116.36, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"3671MIG\", \"Batch_number\": \"ARLS0018\", \"Expiry\": \"04/25\", \"cost_price\": 183.17, \"MRP\": 238.5, \"quantity\": 2, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0036710013\", \"order_item_id\": \"001182482023O11MS\", \"cgst_value\": 25.55, \"sgst_value\": 25.55, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 51.1, \"amount\": 477, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"10123MIG\", \"Batch_number\": \"NCDO-038\", \"Expiry\": \"04/25\", \"cost_price\": 11.95, \"MRP\": 63, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0101230004\", \"order_item_id\": \"001182482023O9MS\", \"cgst_value\": 3.38, \"sgst_value\": 3.38, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 6.76, \"amount\": 63, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"10123MIG\", \"Batch_number\": \"NCDO-078\", \"Expiry\": \"11/24\", \"cost_price\": 11.95, \"MRP\": 57.5, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0101230003\", \"order_item_id\": \"001182482023O15MS\", \"cgst_value\": 3.08, \"sgst_value\": 3.08, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 6.16, \"amount\": 57.5, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"22997MIG\", \"Batch_number\": \"DPE231203\", \"Expiry\": \"04/26\", \"cost_price\": 21.7, \"MRP\": 28.75, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0229970017\", \"order_item_id\": \"001182482023O5MS\", \"cgst_value\": 1.54, \"sgst_value\": 1.54, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 3.08, \"amount\": 28.75, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"19876MIG\", \"Batch_number\": 23442009, \"Expiry\": \"05/25\", \"cost_price\": 118.42, \"MRP\": 159, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0198760033\", \"order_item_id\": \"001182482023O3MS\", \"cgst_value\": 8.52, \"sgst_value\": 8.52, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 17.04, \"amount\": 159, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"26697MIG\", \"Batch_number\": \"16TGR448\", \"Expiry\": \"03/25\", \"cost_price\": 156.1, \"MRP\": 201.15, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0266970004\", \"order_item_id\": \"001182482023O6MS\", \"cgst_value\": 10.78, \"sgst_value\": 10.78, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 21.56, \"amount\": 201.15, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"16797MIG\", \"Batch_number\": \"440701D7\", \"Expiry\": \"07/25\", \"cost_price\": 15.97, \"MRP\": 21.95, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0167970002\", \"order_item_id\": \"001182482023O4MS\", \"cgst_value\": 1.18, \"sgst_value\": 1.18, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 2.36, \"amount\": 21.95, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"16908MIG\", \"Batch_number\": \"01230034\", \"Expiry\": \"12/24\", \"cost_price\": 70.27, \"MRP\": 91.5, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0169080001\", \"order_item_id\": \"001182482023O8MS\", \"cgst_value\": 4.9, \"sgst_value\": 4.9, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 9.8, \"amount\": 91.5, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"42251MIG\", \"Batch_number\": \"DFD0467A\", \"Expiry\": \"01/24\", \"cost_price\": 25.64, \"MRP\": 37.1, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0422510004\", \"order_item_id\": \"001182482023O2MS\", \"cgst_value\": 1.99, \"sgst_value\": 1.99, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 3.98, \"amount\": 37.1, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"47807MIG\", \"Batch_number\": 22443283, \"Expiry\": \"10/24\", \"cost_price\": 39.4, \"MRP\": 51.3, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0478070008\", \"order_item_id\": \"001182482023O14MS\", \"cgst_value\": 2.75, \"sgst_value\": 2.75, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 5.5, \"amount\": 51.3, \"point_earn\": 0, \"point_redeem\": 0 }, { \"order_id\": \"001182482023\", \"invoice\": \"00118248\", \"invoice_date\": \"2023-09-05 00:00:00.000\", \"Payment_type\": \"cash\", \"Patient_id\": 19, \"Doctor_id\": 6, \"Medicine_id\": \"29113MIG\", \"Batch_number\": \"K2202156\", \"Expiry\": \"09/24\", \"cost_price\": 67.32, \"MRP\": 85, \"quantity\": 1, \"loose\": 0, \"cgst\": 6, \"sgst\": 6, \"igst\": 0, \"cess\": 0, \"disc_per\": 0, \"BarCode\": \"0291130009\", \"order_item_id\": \"001182482023O12MS\", \"cgst_value\": 4.55, \"sgst_value\": 4.55, \"igst_value\": 0, \"cess_value\": 0, \"net_gst_value\": 9.1, \"amount\": 85, \"point_earn\": 0, \"point_redeem\": 0 } ]"
    }
}