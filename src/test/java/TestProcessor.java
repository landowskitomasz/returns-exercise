import java.time.Instant;
import java.util.Date;
import java.util.List;
import org.example.Item;
import org.example.ReturnRequest;
import org.example.ReturnRequestProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProcessor {

    @Test
    public void test(){

        ReturnRequest returnRequest = new ReturnRequest();
        returnRequest.order_number = "54653453";
        returnRequest.orderDate = new Date(Instant.parse("2007-12-03T10:15:30.00Z").toEpochMilli());
        Item item = new Item();
        item.setId("1");
        item.setQuantity(2);
        item.setProductCondition("demaged");
        item.setReturnReason("wrong-color");
        returnRequest.setItems(List.of(item));

        String result = new ReturnRequestProcessor().process(returnRequest);

        assertEquals(result, "approved");
    }

    @Test
    public void test2(){

        ReturnRequest returnRequest = new ReturnRequest();
        returnRequest.order_number = "54653453";
        returnRequest.orderDate = new Date(Instant.parse("2023-03-07T10:15:30.00Z").toEpochMilli());
        Item item = new Item();
        item.setId("1");
        item.setQuantity(2);
        item.setProductCondition("demaged");
        item.setReturnReason("wrong-color");
        returnRequest.setItems(List.of(item));

        String result = new ReturnRequestProcessor().process(returnRequest);

        assertEquals(result, "rejected");
    }
}
