package crossing;

import com.carrotsearch.hppc.LongObjectHashMap;
import common.MessageGenerator;
import crossing.tradingSessions.TradingSessionFactory;
import dao.OrderBookDAO;
import dao.TraderDAO;
import orderBook.OrderBook;
import org.junit.Before;
import org.junit.Test;
import sbe.msg.marketData.TradingSessionEnum;
import sbe.reader.BusinessRejectReader;
import sbe.reader.ExecutionReportReader;
import uk.co.real_logic.agrona.DirectBuffer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import static org.junit.Assert.assertNotNull;

public class CrossingProcessorReportTest {

    private static final int STOCK_ID = 1;
    private CrossingProcessor crossingProcessor;

    private DatagramSocket socket;
    private InetAddress address;

    @Before
    public void setup() throws IOException {
        String dataPath = Paths.get("").toAbsolutePath().getParent() + "/data";
        LongObjectHashMap<OrderBook> orderBooks = OrderBookDAO.loadOrderBooks(dataPath);
        TradingSessionFactory.initTradingSessionProcessors(orderBooks);
        TraderDAO.loadTraders(dataPath);
        crossingProcessor = new CrossingProcessor(orderBooks);
        MatchingContext.INSTANCE.setOrderBookTradingSession(1, TradingSessionEnum.ContinuousTrading);
        socket = new DatagramSocket();
        address = InetAddress.getByName("localhost");
    }

    @Test
    public void testOrderCancelRequest() throws Exception {

        DirectBuffer msg = MessageGenerator.buildOrderCancelRequest();
        String response = crossingProcessor.processOrder(msg);
        System.out.println(response);

//        byte[] blah = "Hello".getBytes();
//        System.out.println(blah);
//        DatagramPacket packet = new DatagramPacket(blah, blah.length, address, 1234);
//        socket.send(packet);

//        ExecutionReportReader executionReportReader = new ExecutionReportReader();
//        StringBuilder sb = executionReportReader.read(response);
//        System.out.println(sb.toString());
//        assertNotNull(sb);
    }

    @Test
    public void testOrderCancelRequestRejected() throws Exception {

        DirectBuffer msg = MessageGenerator.buildOrderCancelRequestInvalidSecurity();
        String response = crossingProcessor.processOrder(msg);

//        BusinessRejectReader businessRejectReader = new BusinessRejectReader();
//        StringBuilder sb = businessRejectReader.read(response);
//        System.out.println(sb.toString());
//        assertNotNull(sb);
    }

    @Test
    public void testLimitOrder() throws Exception {

        DirectBuffer msg = MessageGenerator.buildLimitOrder();
        String response = crossingProcessor.processOrder(msg);
        System.out.println(response);

//        BusinessRejectReader businessRejectReader = new BusinessRejectReader();
//        StringBuilder sb = businessRejectReader.read(response);
//        System.out.println(sb.toString());
//        assertNotNull(sb);
    }
}
