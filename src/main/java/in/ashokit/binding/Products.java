package in.ashokit.binding;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@XmlRootElement(name = "productsXml")
@XmlRootElement(name = "productsjson")
public class Products 
{

    private List<Product> product;
}
