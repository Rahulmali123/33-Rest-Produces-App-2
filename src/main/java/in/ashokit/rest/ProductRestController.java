package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(value = "/product", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Product> getProduct() {

		Product product = new Product();
		product.setPid(101);
		product.setPname("Mouse");
		product.setPrice(450.00);

		return new ResponseEntity<>(product, HttpStatus.OK);
	}
}
