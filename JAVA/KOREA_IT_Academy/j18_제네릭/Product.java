package j18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product<T> {
    private String productName;
    private T productInfo;
}
