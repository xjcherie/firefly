package util.ftpUpload;

/**
 * create by cherie on 31/01/2019.
 */
public class FtpUploadFile2 {


//    public void uploadIPOOrderFile() {
////        Map<String, List<IBIPOOrder>> padAccountId_ipoOrder = ibipoOrderService.getIPOOrdersMapInOpen();
//
//        List<Map<String, Object>> ipoOrders = Lists.newArrayList();
//        {
//            Map<String, Object> ipoOrder = Maps.newHashMap();
//            ipoOrder.put("accountId", "U9281169");
//            ipoOrder.put("quantity", String.valueOf(1000));
//            ipoOrders.add(ipoOrder);
//        }
//        Map<String, Object> openIPO = Maps.newHashMap();
//        openIPO.put("ipoName", "1749-IPO");
//        openIPO.put("padAccountId", "U2438092");
//        openIPO.put("brokerRequestId", "1749-IPO-201806140830");
//        openIPO.put("totalQuantity", String.valueOf(1000));
//        openIPO.put("ctime", new DateTime());
//
//        try {
//            Template template = FreeMarkers.getTemplate(IB_IPO_ORDER_XML_TPL);
//
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            template.process(ImmutableMap.of("openIPO", openIPO, "ipoOrders", ipoOrders), new OutputStreamWriter(byteArrayOutputStream, "UTF8"));
//            byte[] bytes = byteArrayOutputStream.toByteArray();
//
//            String fileName = "1749-IPO.s90.IPOOrderRequest.20180614." + "1528936200000" + ".xml.gpg";
//
//            String IB_PGP_PUBKEY = "/keystore/ibkey-snb-prod.asc";
//            String XQ_PGP_SecKey = "/keystore/XQPGP_SecKey.asc";
//            String XQ_PASSWD = "xueqiu2017";
//
//            byte[] encrypt = PGPCryptoUtils.encryptAndSign(bytes, fileName, XQ_PGP_SecKey, XQ_PASSWD, IB_PGP_PUBKEY);
//
//            ByteArrayInputStream stream = new ByteArrayInputStream(encrypt);
//
//            FTPClient client = new FTPClient();
//            FTPClientConfig config = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
//            config.setDefaultDateFormatStr("yyyy-MM-dd HH:mm:ss");
//            client.configure(config);
//            client.connect(ftp3Server);
//            client.login(ftp3Username, ftp3Password);
//            client.setFileType(FTP.BINARY_FILE_TYPE);
//            client.enterLocalPassiveMode();
//            client.changeWorkingDirectory("/incoming");
//            client.storeFile(fileName, stream);
//
//            LOGGER.info("Acats upload xml, {}", new String(bytes));
//            stream.close();
//            client.logout();
//            client.disconnect();
//        } catch (TemplateException | IOException | PGPException e) {
//            LOGGER.error("upload open xml file to ftp failed", e);
//        }
//
//    }
}
