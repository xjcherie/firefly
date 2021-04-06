package util;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.GeneralBasicOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.GeneralBasicOCRResponse;

/**
 * Created by Cherie on 2020/11/05
 **/
public class TencentOCRUtils {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential("", "");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("ocr.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);

            GeneralBasicOCRRequest req = new GeneralBasicOCRRequest();
            req.setImageUrl("https://img-hotel-1258330438.image.myqcloud.com/2020/11/04/11/34/852b0199-abf8-4309-a169-5fb09631e000.jpg-middle");

            GeneralBasicOCRResponse resp = client.GeneralBasicOCR(req);

            System.out.println(GeneralBasicOCRResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }

    }

//    {"TextDetections":[{"DetectedText":"13:48 1","Confidence":85,"Polygon":[{"X":22,"Y":11},{"X":66,"Y":11},{"X":66,"Y":23},{"X":22,"Y":23}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":1}}","ItemPolygon":{"X":22,"Y":11,"Width":45,"Height":13}},{"DetectedText":"<格林豪泰快捷酒店(北京回龙观平西...","Confidence":96,"Polygon":[{"X":14,"Y":47},{"X":268,"Y":47},{"X":268,"Y":63},{"X":14,"Y":63}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":2}}","ItemPolygon":{"X":14,"Y":47,"Width":255,"Height":17}},{"DetectedText":"Q1)地区人员入住酒店有对应入住要求，请提前联系酒店咨计>","Confidence":93,"Polygon":[{"X":18,"Y":82},{"X":307,"Y":82},{"X":307,"Y":95},{"X":18,"Y":95}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":3}}","ItemPolygon":{"X":18,"Y":82,"Width":290,"Height":14}},{"DetectedText":"11月4日今天(晚)- 11月5日明天","Confidence":90,"Polygon":[{"X":22,"Y":124},{"X":206,"Y":124},{"X":206,"Y":138},{"X":22,"Y":138}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":4}}","ItemPolygon":{"X":22,"Y":124,"Width":185,"Height":15}},{"DetectedText":"房型详情>","Confidence":98,"Polygon":[{"X":248,"Y":125},{"X":297,"Y":125},{"X":297,"Y":137},{"X":248,"Y":137}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":4}}","ItemPolygon":{"X":248,"Y":125,"Width":50,"Height":13}},{"DetectedText":"1米8特惠大床房(无窗)[标准]","Confidence":99,"Polygon":[{"X":22,"Y":149},{"X":169,"Y":149},{"X":169,"Y":162},{"X":22,"Y":162}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":4}}","ItemPolygon":{"X":22,"Y":149,"Width":148,"Height":14}},{"DetectedText":"大床.无早餐一2人入住- 20m*-无窗.禁烟","Confidence":80,"Polygon":[{"X":22,"Y":171},{"X":235,"Y":171},{"X":235,"Y":183},{"X":22,"Y":183}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":5}}","ItemPolygon":{"X":22,"Y":171,"Width":214,"Height":13}},{"DetectedText":"放心订!今天18点前可免费取消","Confidence":99,"Polygon":[{"X":22,"Y":209},{"X":165,"Y":209},{"X":165,"Y":221},{"X":22,"Y":221}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":6}}","ItemPolygon":{"X":22,"Y":209,"Width":144,"Height":13}},{"DetectedText":"订房必读》","Confidence":96,"Polygon":[{"X":248,"Y":208},{"X":297,"Y":208},{"X":297,"Y":220},{"X":248,"Y":220}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":7}}","ItemPolygon":{"X":248,"Y":208,"Width":50,"Height":13}},{"DetectedText":"酒店提示:根据《北京市宾馆不得主动提供的一","Confidence":98,"Polygon":[{"X":22,"Y":225},{"X":236,"Y":225},{"X":236,"Y":237},{"X":22,"Y":237}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":8}}","ItemPolygon":{"X":22,"Y":225,"Width":215,"Height":13}},{"DetectedText":"次性用晶目录》相关规定，自2020年5月18...","Confidence":96,"Polygon":[{"X":22,"Y":240},{"X":229,"Y":240},{"X":229,"Y":252},{"X":22,"Y":252}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":9}}","ItemPolygon":{"X":22,"Y":240,"Width":208,"Height":13}},{"DetectedText":"0价格最低 赞!您已选择本店最划算的客房!","Confidence":92,"Polygon":[{"X":10,"Y":288},{"X":242,"Y":288},{"X":242,"Y":302},{"X":10,"Y":302}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":10}}","ItemPolygon":{"X":10,"Y":288,"Width":233,"Height":15}},{"DetectedText":"❹客房紧张 该客房仅剩最后2间，再不下单.就...","Confidence":92,"Polygon":[{"X":10,"Y":310},{"X":266,"Y":310},{"X":266,"Y":325},{"X":10,"Y":325}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":11}}","ItemPolygon":{"X":10,"Y":310,"Width":257,"Height":16}},{"DetectedText":"房间数量1间 (每间最多住2人)","Confidence":93,"Polygon":[{"X":13,"Y":350},{"X":204,"Y":350},{"X":204,"Y":364},{"X":13,"Y":364}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":11}}","ItemPolygon":{"X":13,"Y":350,"Width":192,"Height":15}},{"DetectedText":"住客姓名⑦袁伟","Confidence":97,"Polygon":[{"X":13,"Y":393},{"X":111,"Y":393},{"X":111,"Y":408},{"X":13,"Y":408}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":12}}","ItemPolygon":{"X":13,"Y":393,"Width":99,"Height":16}},{"DetectedText":"8","Confidence":67,"Polygon":[{"X":291,"Y":391},{"X":305,"Y":391},{"X":305,"Y":410},{"X":291,"Y":410}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":13}}","ItemPolygon":{"X":291,"Y":391,"Width":15,"Height":20}},{"DetectedText":"联系手机","Confidence":99,"Polygon":[{"X":13,"Y":436},{"X":65,"Y":436},{"X":65,"Y":450},{"X":13,"Y":450}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":14}}","ItemPolygon":{"X":13,"Y":436,"Width":53,"Height":15}},{"DetectedText":"86 v 185 1827 7209","Confidence":75,"Polygon":[{"X":84,"Y":437},{"X":229,"Y":437},{"X":229,"Y":449},{"X":84,"Y":449}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":14}}","ItemPolygon":{"X":84,"Y":437,"Width":146,"Height":13}},{"DetectedText":"预计到店","Confidence":99,"Polygon":[{"X":13,"Y":480},{"X":63,"Y":480},{"X":63,"Y":494},{"X":13,"Y":494}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":15}}","ItemPolygon":{"X":13,"Y":480,"Width":51,"Height":15}},{"DetectedText":"13:00 (房间将整晚保留)","Confidence":92,"Polygon":[{"X":85,"Y":479},{"X":223,"Y":479},{"X":223,"Y":494},{"X":85,"Y":494}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":15}}","ItemPolygon":{"X":85,"Y":479,"Width":139,"Height":16}},{"DetectedText":"》","Confidence":85,"Polygon":[{"X":289,"Y":481},{"X":298,"Y":481},{"X":298,"Y":492},{"X":289,"Y":492}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":16}}","ItemPolygon":{"X":289,"Y":481,"Width":10,"Height":12}},{"DetectedText":"优惠百已为您选择最大优惠","Confidence":94,"Polygon":[{"X":13,"Y":535},{"X":179,"Y":535},{"X":179,"Y":550},{"X":13,"Y":550}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":17}}","ItemPolygon":{"X":13,"Y":535,"Width":167,"Height":16}},{"DetectedText":"抵用券","Confidence":99,"Polygon":[{"X":13,"Y":575},{"X":51,"Y":575},{"X":51,"Y":589},{"X":13,"Y":589}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":17}}","ItemPolygon":{"X":13,"Y":575,"Width":39,"Height":15}},{"DetectedText":"满￥150减￥9","Confidence":99,"Polygon":[{"X":92,"Y":575},{"X":164,"Y":575},{"X":164,"Y":588},{"X":92,"Y":588}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":17}}","ItemPolygon":{"X":92,"Y":575,"Width":73,"Height":14}},{"DetectedText":"￥180","Confidence":99,"Polygon":[{"X":13,"Y":630},{"X":50,"Y":630},{"X":50,"Y":644},{"X":13,"Y":644}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":18}}","ItemPolygon":{"X":13,"Y":630,"Width":38,"Height":15}},{"DetectedText":"明细^","Confidence":96,"Polygon":[{"X":120,"Y":636},{"X":148,"Y":636},{"X":148,"Y":646},{"X":120,"Y":646}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":19}}","ItemPolygon":{"X":120,"Y":636,"Width":29,"Height":11}},{"DetectedText":"提交订单","Confidence":99,"Polygon":[{"X":213,"Y":635},{"X":267,"Y":635},{"X":267,"Y":649},{"X":213,"Y":649}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":20}}","ItemPolygon":{"X":213,"Y":635,"Width":55,"Height":15}},{"DetectedText":"已优惠￥9","Confidence":98,"Polygon":[{"X":13,"Y":648},{"X":52,"Y":648},{"X":52,"Y":657},{"X":13,"Y":657}],"AdvancedInfo":"{\"Parag\":{\"ParagNo\":21}}","ItemPolygon":{"X":13,"Y":648,"Width":40,"Height":10}}],"Language":"zh","Angel":0.0,"RequestId":"ee604e4d-f415-41b0-8e4c-824804479341"}

}
