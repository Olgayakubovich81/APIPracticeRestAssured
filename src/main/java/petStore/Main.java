package petStore;

import io.restassured.http.ContentType;

import java.time.LocalDateTime;
import java.util.List;

import static io.restassured.RestAssured.given;
import static petStore.Status.PLACED;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets =given()
                .when()
                .log().all()
                .queryParam("status", "available")
                .get("https://petstore.swagger.io/v2" + "/pet/findByStatus")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .getList("", Pet.class);
//
//        pets.forEach(System.out::println);
//
//        for(int i=0; i<pets.size(); i++){
//            System.out.println(pets.get(i));
//        }
//        for (Pet pet: pets) {
//            System.out.println(pet);
//        }
//        int i = 0;
//        while (i<pets.size()){
//            System.out.println(pets.get(i));
//            i++;
//        }
//
        given()
                .when()
                .log().all()
                .get("https://petstore.swagger.io/v2" + "/pet/10")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath();

//              Pet pet = new Pet ();
//            pet.setCategory(new Category(99L, "name"));
//            pet.setTags(List.of(new Tag(9L, "name")));
//                         ;
//              pet.setName("barsik");
//              pet.setStatus("available");
//              pet.setPhotoUrls(List.of("url","url2"));

//
//        Long id = given()
//                .when()
//                .log().all()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .body(pet)
//                .post("https://petstore.swagger.io/v2"+ "/pet")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .body()
//                .path("id");


        Order order = new Order();
        Order order1 = new Order(23, 56, "2024-05-28T10:13:24.911+0000", "placed", true);

//                Integer id= given()
//                        .when()
//                        .log().all()
//                        .contentType(ContentType.JSON)
//                        .accept(ContentType.JSON)
//                        .body(order1)
//                        .post("https://petstore.swagger.io/v2"+ "/store/order")
//                        .then()
//                        .log().all()
//                        .statusCode(200)
//                        .extract()
//                        .path("id");
//
//
//        System.out.println("Database " +id);


//        Order order2 = given()
//                .when()
//                .log().all()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .get("https://petstore.swagger.io/v2" + "/store/order/2")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .body()
//                .as(Order.class);
//
//        System.out.println(order2);

//
//        String body = given()
//                .when()
//                .log().all()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .get("https://petstore.swagger.io/v2" + "/store/inventory")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .body().asString();
//
//        System.out.println(body);

//                  given()
//                .when()
//                .log().all()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .delete("https://petstore.swagger.io/v2" + "/store/order/11")
//                .then()
//                .log().all()
//                .statusCode(404);


//        User user = given()
//                .when()
//                .log().all()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .get("https://petstore.swagger.io/v2" + "/user/user1")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .as(User.class);
//
//        System.out.println(user);


        User user1=new User();
        user1.setEmail("123@gmail.com");
        user1.setId(9L);
        user1.setFirstName("Maria");
        user1.setLastName("Ivanova");
        user1.setPassword("1235");
        user1.setPhone("7989");
        user1.setUsername("lelik");
        user1.setUserStatus(5);




                        given()
                        .when()
                        .log().all()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .body(user1)
                        .post("https://petstore.swagger.io/v2"+ "/user")
                        .then()
                        .log().all()
                        .statusCode(200);


    }
}







