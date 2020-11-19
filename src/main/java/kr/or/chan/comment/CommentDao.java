package kr.or.chan.comment;

import static kr.or.chan.comment.CommentDaoSqls.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDao {
	private NamedParameterJdbcTemplate jdbcTemplate;
	private RowMapper<Comment> rowMapper = BeanPropertyRowMapper.newInstance(Comment.class);

	public CommentDao(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<Comment> selectTopThreeComment(int productId) {
		Map<String, Object> params = Collections.singletonMap("productId", productId);
		return jdbcTemplate.query(SELECT_TOP_THREE_COMMENT, params, rowMapper);
	}

	public List<Comment> selectAllComment(int productId) {
		Map<String, Object> params = Collections.singletonMap("productId", productId);
		return jdbcTemplate.query(SELECT_ALL_COMMENT, params, rowMapper);
	}

<<<<<<< HEAD
	public Comment getTotalCountAndAverage(int productId) {
=======
	public Comment getTotalCountAverage(int productId) {
>>>>>>> bfd249f7d67ddcebe5c4caeb50018da9619fee7e
		Map<String, Object> params = Collections.singletonMap("productId", productId);
		return jdbcTemplate.queryForObject(GET_COUNT_AND_AVG_SCORE, params, rowMapper);
	}
}
