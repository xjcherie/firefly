package util.ftpUpload;

/**
 * create by cherie on 31/01/2019.
 */
public class FtpUploadFile3 {
//    private static final Logger LOGGER = LoggerFactory.getLogger(IBIPOFtp.class);
//
//    private static final Map<String, IBFTPEnum> ftpEnumMap = ImmutableMap.of(
//            "U2246129", IBFTPEnum.FTP_YJ,
//            "U2246129", IBFTPEnum.FTP_SNB
//    );
//
//    private String IB_IPO_ORDER_XML_TPL = "ib_ipo_order.ftl";
//
//    private String ftp3Server = "ftp3.interactivebrokers.com";
//
//    private String ftp3Username = "snbipo";
//
//    private String ftp3Password = "94iyAgNTE6UYdR94";
//
//    @Value("${ftp.ib.server}")
//    private String server;
//
//    @Value("${ftp.ib.username}")
//    private String username;
//
//    @Value(("${ftp.ib.password}"))
//    private String password;
//
//    @Autowired
//    private IBIPOOrderService ibipoOrderService;
//
//    public void uploadIPOOrderFile() {
//        List<IBBrokerIPOOrder> ibBrokerIPOOrders = ibipoOrderService.getIBIPOOrderInOpen();
//        for (IBBrokerIPOOrder brokerIPOOrder : ibBrokerIPOOrders) {
//            Map<String, List<IBIPOOrder>> symbol_ordersMap = brokerIPOOrder.getSymbol_ipoOrdersMap();
//            for (String symbol : symbol_ordersMap.keySet()) {
//                this.uploadFile(brokerIPOOrder, symbol, symbol_ordersMap.get(symbol));
//            }
//        }
//    }
//
//    private void uploadFile(IBBrokerIPOOrder ibBrokerIPOOrder, String symbol, List<IBIPOOrder> ibipoOrders) {
//        ZonedDateTime zdt = DateUtil.toEastAmericaTime(LocalDateTime.now());
//        String formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX").format(zdt);
//        String formatDate = DateTimeFormatter.ofPattern("yyyyMMdd").format(zdt);
//        long time = zdt.toEpochSecond();
//        long totalQuantity = 0;
////        List<Map<String, Object>> ipoOrders = Lists.newArrayList();
////        for (IBIPOOrder order : ibipoOrders) {
////            Map<String, Object> ipoOrder = Maps.newHashMap();
////            ipoOrder.put("accountId", order.getAccountId());
////            ipoOrder.put("quantity", order.getExpectQuantity());
////            ipoOrders.add(ipoOrder);
////
////            totalQuantity += order.getExpectQuantity();
////        }
////        Map<String, Object> openIPO = Maps.newHashMap();
////        openIPO.put("ipoName", ibBrokerIPOOrder.getIpoName());
////        openIPO.put("padAccountId", ibBrokerIPOOrder.getBrokerId());
////        openIPO.put("brokerRequestId", symbol + "_" + time);
////        openIPO.put("totalQuantity", totalQuantity);
////        openIPO.put("ctime", formatDateTime);
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
//        openIPO.put("brokerRequestId", "1749-IPO_" + time);
//        openIPO.put("totalQuantity", String.valueOf(1000));
//        openIPO.put("ctime", formatDateTime);
//
//        Map<String, Object> dataMap = ImmutableMap.of("openIPO", openIPO, "ipoOrders", ipoOrders);
//        String fileName = String.format("%s.%s.IPOOrderRequest.%s.%s.xml.gpg", ibBrokerIPOOrder.getIpoName(), "s90", formatDate, time);
//
////        String fileName = ibBrokerIPOOrder.getIpoName() + ".s90.IPOOrderRequest." + formatDate + "." + System.currentTimeMillis() + ".xml.gpg";
//        LOGGER.info("IPOOrder upload fileName:{}.", fileName);
//        LOGGER.info("IPOOrder upload data:{}.", dataMap);
//
//        FTPClient client = null;
//        try {
//            Template template = FreeMarkers.getTemplate(IB_IPO_ORDER_XML_TPL);
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            template.process(dataMap, new OutputStreamWriter(byteArrayOutputStream, "UTF8"));
//            byte[] bytes = byteArrayOutputStream.toByteArray();
//
//            String IB_PGP_PUBKEY = "/keystore/ibkey-snb-prod.asc";
//            String XQ_PGP_SecKey = "/keystore/XQPGP_SecKey.asc";
//            String XQ_PASSWD = "xueqiu2017";
//
//            byte[] encrypt = PGPCryptos.encryptAndSignature(bytes, fileName, XQ_PGP_SecKey, XQ_PASSWD, IB_PGP_PUBKEY);
//
//            client = FTPClientUtils.connect(ftp3Server, ftp3Username, ftp3Password);
//            client.changeWorkingDirectory("/incoming");
//            client.storeFile(fileName, new ByteArrayInputStream(encrypt));
//            LOGGER.info("IPOOrder upload xml, {}", new String(bytes));
//
//        } catch (TemplateException | IOException | PGPException e) {
//            LOGGER.error("IPOOrder upload xml file to ftp failed", e);
//        } finally {
//            FTPClientUtils.close(client);
//        }
//    }

}
