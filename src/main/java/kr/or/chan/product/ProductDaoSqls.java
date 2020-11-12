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
		+ "ORDER BY id ASC limit :start, :limit";
	public static final String SELECT_PRODUCT_BY_ID = ""
		+ "SELECT product.id"
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
		+ "FROM product "
		+ "JOIN display_info ON product.id = display_info.product_id "
		+ "WHERE product.id = :id";
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
		+ "ORDER BY id ASC limit :start, :limit";
}
