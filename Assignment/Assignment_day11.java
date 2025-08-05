
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class readfile
	{
	public static void main(String args[])
	{
		try
		{
			File file=new File("file2.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line=br.readLine();
			while(line != null)
			{
			System.out.println(line);
			line=br.readLine();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}

//-------------------------------------------------------------------------------------
class writings
	{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		/*try
		{

		BufferedWriter br=new BufferedWriter(new FileWriter("newfile.txt"));
		System.out.println("Enter data to write a file");
		String input=s.nextLine();;
		br.write(input);
		br.flush();
		System.out.println("SuccessFully Written...!");
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}*/


		/*try
		{
		BufferedReader br=new BufferedReader(new FileReader("newfile.txt"));
		String line=br.readLine();
		BufferedWriter bw=new BufferedWriter(new FileWriter("filenew.txt"));
		while(line != null)
		{
			bw.write(line);
			bw.flush();
			bw.newLine();
			line=br.readLine();
		
		}
			System.out.println("SuccessFully Written one File to another");
		}
		catch(Exception e)
		
		{
			System.out.println(e.getMessage());
		}*/
			
		
		/*try
		{
		BufferedReader br=new BufferedReader(new FileReader("newfile.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("filenew.txt"));
		String line=br.readLine();
		while(line != null)
		{
			String updateline=line.replaceAll("devi","thangam");
			updateline=updateline.replaceAll("kondanagaram","pirancheri");
			bw.write(updateline);
			bw.flush();
			line=br.readLine();
			
		}
		System.out.println("SuccessFully updated...!");
	
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}*/

		/*String word="India";
		try
		{
		BufferedReader br=new BufferedReader(new FileReader("newfile.txt"));
		String line=br.readLine();
		int count=0;
		while(line !=null)
		{
		String[] words=line.split("[ ,.]");
		for(String str:words)
		{
			if(str.equals(word))
				{
				count++;
				}
		}
		line=br.readLine();
		
		}
		System.out.println(word+" is in the file "+count+" times"); 
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}*/

		try
		{
		BufferedReader br=new BufferedReader(new FileReader("electronics.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("ele.csv"));
		String line=br.readLine();
		bw.write("S.NO,NAME,BRAND\n");
		while(line != null)
		{
		String[] words=line.split(" ");
		bw.write(words[0]+","+words[1]+","+words[2]+"\n");
		bw.flush();
		line=br.readLine();
		

		}	
		System.out.println("Succesfully Converted txtfile to csvfile");
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	}
//----------------------------------------------------------------------------------------
class countings
	{
	public static void main(String args[])
		{
			int linecount=0;
			int wordcount=0;
			int charcount=0;
			try
			{
				BufferedReader br=new BufferedReader(new FileReader("newfile.txt"));
				String line=br.readLine();
				while(line!=null)
				{
					if(!line.isEmpty())
					{
					linecount++;
					}

					charcount+=line.length();
					String[] words = line.trim().split("[\\s\\p{Punct}]+");
					
					for(String str:words)
					{
						if(!str.isEmpty())
						{
							wordcount++;
						}
					}
				        line=br.readLine();
				}
				System.out.println("Counting of lines:"+linecount);
				System.out.println("Counting of words:"+wordcount);
				System.out.println("Counting ofCharacters:"+charcount);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

//---------------------------------------------------------------------------------------------
class appending
	{
	public static void main(String args[])
		{
		try
		{
		BufferedWriter bw=new BufferedWriter(new FileWriter("filenew.txt",true));
		bw.write("\ni completed b.sc.Maths");
		bw.write("\nnow i preparing for zoho interviews");
		bw.flush();
		System.out.println("Successfully Appended");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());

		}
		}
	}
//------------------------------------------------------------------------------------------
class fileinventory implements Serializable
	{
		int productid;
		String name;
		double price;
		int quantity;
		
		fileinventory(int productid,String name,double price,int quantity)
		{
		this.productid=productid;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		}

		int getProductid()
		{
			return productid;
		}
		String getName()
		{
			return name;
		}
		double getPrice()
		{
			return price;
		}
		int getQuantity()
		{
			return quantity;
		}


		public String toString()
		{
			return "ProductId: "+productid+"\tName: "+name+"\tPrice: "+price+"\tQuantity: "+quantity;
		}
		void setProductid(int productid)
		{
			this.productid=productid;
		}
		void setName(String name )
		{
			this.name=name;
		}
		void setPrice(double price)
		{
			this.price=price;
		}
		void setQuantity(int quantity)
		{
			this.quantity=quantity;
		}
	

		
	}


 class InventorySystem {
    private static final String FILENAME = "products.dat";
    private static List<fileinventory> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadProducts(); 

        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addProduct(); break;
                case 2: viewAllProducts(); break;
                case 3: searchProductById(); break;
                case 4: updateProduct(); break;
                case 5: deleteProduct(); break;
                case 6: saveProducts(); System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n--- Product Inventory System ---");
        System.out.println("1. Add a Product");
        System.out.println("2. View All Products");
        System.out.println("3. Search Product by ID");
        System.out.println("4. Update Product");
        System.out.println("5. Delete Product");
        System.out.println("6. Exit");
    }

    private static void addProduct() {
        System.out.println("\n--- Add Product ---");
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        products.add(new fileinventory(id, name, price, quantity));
        System.out.println("Product added successfully!");
        saveProducts(); 
    }

    private static void viewAllProducts() {
        System.out.println("\n--- All Products ---");
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for (fileinventory p : products) {
            System.out.println(p);
        }
    }

    private static void searchProductById() {
        System.out.println("\n--- Search Product by ID ---");
        System.out.print("Enter Product ID to search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine();

        fileinventory foundProduct = null;
        for (fileinventory p : products) {
            if (p.getProductid() == searchId) {
                foundProduct = p;
                break;
            }
        }

        if (foundProduct != null) {
            System.out.println("Product Found: " + foundProduct);
        } else {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }

    private static void updateProduct() {
        System.out.println("\n--- Update Product ---");
        System.out.print("Enter Product ID to update: ");
        int updateId = scanner.nextInt();
        scanner.nextLine();

        fileinventory productToUpdate = null;
        for (fileinventory p : products) {
            if (p.getProductid() == updateId) {
                productToUpdate = p;
                break;
            }
        }

        if (productToUpdate != null) {
            System.out.print("Enter new Price (current: " + productToUpdate.getPrice() + "): ");
            double newPrice = scanner.nextDouble();
            System.out.print("Enter new Quantity (current: " + productToUpdate.getQuantity() + "): ");
            int newQuantity = scanner.nextInt();
            scanner.nextLine();

            productToUpdate.setPrice(newPrice);
            productToUpdate.setQuantity(newQuantity);
            System.out.println("Product updated successfully!");
            saveProducts(); 
        } else {
            System.out.println("Product with ID " + updateId + " not found.");
        }
    }

    private static void deleteProduct() {
        System.out.println("\n--- Delete Product ---");
        System.out.print("Enter Product ID to delete: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();

   boolean removed = false;
    for (int i = 0; i < products.size(); i++) {
    if (products.get(i).getProductid() == deleteId) {
        products.remove(i);
        removed = true;
        break;
    }
}

        if (removed) {
            System.out.println("Product deleted successfully!");
            saveProducts(); 
        } else {
            System.out.println("Product with ID " + deleteId + " not found.");
        }
    }

    private static void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.err.println("Error saving products: " + e.getMessage());
        }
    }
	@SuppressWarnings("unchecked")
    private static void loadProducts() {
        File file = new File(FILENAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
                products = (List<fileinventory>) ois.readObject();
            } catch (FileNotFoundException e) {
                
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error loading products: " + e.getMessage());
            }
        }
    }
}


