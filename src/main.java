
public class main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.id=1;
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		
		
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		

	}

}
