package kr.or.chan.product;

public class ProductDaoSqls {
	public static final int GET_MORE_PRODUCT_COUNT = 4;
	public static final String SELECT_ALL_PRODUCT = ""
		+ "SELECT product.id id"
		+ "		, category_id"
		+ "		, description"
		+ "     , content"
		+ "		, event"
		+ "		, place_name"
		+ "		, product_image.id image_id"
		+ "		, product.create_date"
		+ "		, product.modify_date "
		+ "FROM product "
		+ "JOIN product_image ON product.id = product_image.product_id "
		+ "JOIN display_info ON product.id = display_info.product_id "
		+ "WHERE product_image.type='th' "
		+ "GROUP BY product.id "
<<<<<<< HEAD
		+ "ORDER BY id ASC "
		+ "LIMIT :start, :limit";

=======
		+ "ORDER BY id ASC limit :start, :limit";
>>>>>>> bfd249f7d67ddcebe5c4caeb50018da9619fee7e
	public static final String SELECT_PRODUCT_BY_ID = ""
		+ "SELECT product.id product_id"
		+ "		, category_id"
		+ "		, description"
		+ "		, content"
		+ "		, event"
		+ "		, product.create_date"
		+ "		, product.modify_date"
		+ "		, display_info.place_name"
		+ "		, place_lot"
		+ " 	, place_street"
		+ "		, tel "
<<<<<<< HEAD
		+ " 	, save_file_name "
=======
>>>>>>> bfd249f7d67ddcebe5c4caeb50018da9619fee7e
		+ "		, product_image.type"
		+ "		, product_image.id id "
		+ "FROM product "
		+ "JOIN display_info ON product.id = display_info.product_id "
<<<<<<< HEAD
		+ "JOIN display_info_image ON display_info.id = display_info_image.display_info_id "
		+ "JOIN product_image ON product.id = product_image.product_id "
		+ "LEFT JOIN file_info ON file_info.id = display_info_image.file_id "
		+ "WHERE product.id = :id "
		+ "AND product_image.type='th'";

=======
		+ "JOIN product_image ON product.id = product_image.product_id "
		+ "WHERE product.id = :id "
		+ "AND product_image.type='th'";
>>>>>>> bfd249f7d67ddcebe5c4caeb50018da9619fee7e
	public static final String SELECT_PRODUCT_BY_CATEGORY_ID = ""
		+ "SELECT product.id id"
		+ "		, category_id"
		+ "		, description"
		+ "		, content"
		+ "		, event, place_name"
		+ "		, product_image.id image_id"
		+ "		, product.create_date"
		+ "		, product.modify_date "
		+ "FROM product "
		+ "JOIN product_image ON product.id = product_image.product_id "
		+ "JOIN display_info ON product.id = display_info.product_id "
		+ "WHERE product_image.type='th' "
		+ "AND category_id = :categoryId "
		+ "GROUP BY product.id "
<<<<<<< HEAD
		+ "ORDER BY id ASC "
		+ "LIMIT :start, :limit";
=======
		+ "ORDER BY id ASC limit :start, :limit";
>>>>>>> bfd249f7d67ddcebe5c4caeb50018da9619fee7e
}
