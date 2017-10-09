package cn.itcast.bos.domain.base.take_delivery;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 自定义封装分页数据
 * 
 * @author 李吴楠 18717344828
 *
 * @param <T>
 */
@XmlRootElement(name="PageBean")  // 声明未被序列化 
@XmlSeeAlso({Promotion.class})
public class PageBean<T> {

	/** 总数据 */
	private Long totalCount;
	
	/** 查询所显示的数据 */
	private List<Promotion> pageData;

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Promotion> getPageData() {
		return pageData;
	}

	public void setPageData(List<Promotion> pageData) {
		this.pageData = pageData;
	}
	
}
