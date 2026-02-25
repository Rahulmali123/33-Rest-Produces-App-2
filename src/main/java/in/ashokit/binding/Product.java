package in.ashokit.binding;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class Product 
{

    private Integer pid;
    private String pname;
    private Double price;
    

}
