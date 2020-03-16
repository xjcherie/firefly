package util.ftpUpload;

/**
 * create by cherie on 31/01/2019.
 */
public class FtpUploadFile {

//    private static final Logger LOGGER = LoggerFactory.getLogger(IBIPOFtp.class);
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
//    public static void main(String[] args) {
//
//        ZonedDateTime zdt = DateUtil.toEastAmericaTime(LocalDateTime.now());
//        String formatTime = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ").format(zdt);
//        System.out.println(formatTime);
//        System.out.println(zdt.toString());
//    }
//
//    //    private void uploadFile(String brokerId, Map<String, Object> openIPO, List<Map<String, Object>> ipoOrderList) {
//    private void uploadFile(IBBrokerIPOOrder ibBrokerIPOOrder, String symbol, List<IBIPOOrder> ibipoOrders) {
//        Map<String, Object> openIPO = Maps.newHashMap();
//        List<Map<String, Object>> ipoOrders = Lists.newArrayList();
//
//
//        ZonedDateTime zdt = DateUtil.toEastAmericaTime(LocalDateTime.now());
//        String formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ").format(zdt);
//        String formatDate = DateTimeFormatter.ofPattern("yyyyMMdd").format(zdt);
//        String formatTime = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(zdt);
//        long totalQuantity = 0;
//        for (IBIPOOrder order : ibipoOrders) {
//            Map<String, Object> ipoOrder = Maps.newHashMap();
//            ipoOrder.put("accountId", order.getAccountId());
//            ipoOrder.put("quantity", order.getExpectQuantity());
//            ipoOrders.add(ipoOrder);
//
//            totalQuantity += order.getExpectQuantity();
//        }
//
//        openIPO.put("ipoName", ibBrokerIPOOrder.getIpoName());
//        openIPO.put("padAccountId", ibBrokerIPOOrder.getBrokerId());
//        openIPO.put("brokerRequestId", symbol + "_" + formatTime);
//        openIPO.put("totalQuantity", totalQuantity);
//        openIPO.put("ctime", formatDateTime);
//
//        try {
//            Template template = FreeMarkers.getTemplate(IB_IPO_ORDER_XML_TPL);
//
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            template.process(ImmutableMap.of("openIPO", openIPO, "ipoOrders", ipoOrders), new OutputStreamWriter(byteArrayOutputStream, "UTF8"));
//            byte[] bytes = byteArrayOutputStream.toByteArray();
//
//            String fileName = "Test-IPO.s90.IPOOrderRequest." + formatDate + "." + System.currentTimeMillis() + ".xml.gpg";
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
//            LOGGER.info("IPOOrder upload xml, {}", new String(bytes));
//            stream.close();
//            client.logout();
//            client.disconnect();
//        } catch (TemplateException | IOException | PGPException e) {
//            LOGGER.error("IPOOrder upload xml file to ftp failed", e);
//        } finally {
//
//        }
//    }

}
