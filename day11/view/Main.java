package day11.view;

import day11.dao.ProductDAO;
import day11.dto.ProductDTO;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void printProduct(List<ProductDTO> list){
        for(ProductDTO product : list){
            System.out.println(product.getId()+"\t"
                    +product.getName()+"\t"
                    +product.getPrice()+"\t"
                    +product.getDate());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDTO dto;
        ProductDAO dao = new ProductDAO();
        while(true){
            System.out.println("<<상품 관리 시스템>>");
            System.out.println("1. 신규 상품 등록 ");
            System.out.println("2. 상품 목록 출력");
            System.out.println("3. 상품 검색 (상품명으로)");
            System.out.println("4. 상품 삭제 (상품 ID로)");
            System.out.println("5. 정보 수정 (상품 ID로)");
            System.out.println("0. 종료");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    System.out.print("상품 ID >>");
                    String id = sc.nextLine();
                    System.out.print("상품 이름 >>");
                    String name = sc.nextLine();
                    System.out.print("상품 가격 >>");
                    int price = Integer.parseInt(sc.nextLine());
                    dao.addProduct(new ProductDTO(id, name, price, System.currentTimeMillis()));
                    break;
                case 2:
                    System.out.println("ID\t Name\tPrice\tDate");
                    printProduct(dao.getProductList());
                    break;
                case 3:
                    System.out.print("검색할 상품 이름 >>");
                    name = sc.nextLine();
                    List<ProductDTO> searchProduct = dao.searchByName(name);
                    System.out.println("ID\tName\tPrice\tDate");
                    printProduct(searchProduct);
                    break;
                case 4:
                    System.out.print("삭제할 상품 ID >>");
                    id = sc.nextLine();
                    if(dao.deleteById(id)){
                        System.out.println("삭제 성공");
                    }else{
                        System.out.println("삭제 실패");
                    }
                    break;
                case 5:
                    System.out.print("수정할 상품 ID >>");
                    id = sc.nextLine();
                    if(dao.updateById(id)){
                        System.out.print("상품 이름 >>");
                        name = sc.nextLine();
                        System.out.print("상품 가격 >>");
                        price = Integer.parseInt(sc.nextLine());
                        dao.updateContent(id,name,price);
                        //dao.addProduct(new ProductDTO(id, name, price, System.currentTimeMillis()));
                    }else{
                        System.out.println("존재하지 않는 상품 ID입니다. 수정에 실패했습니다.");
                    }
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력");
                    break;
            }
        }

    }
}
