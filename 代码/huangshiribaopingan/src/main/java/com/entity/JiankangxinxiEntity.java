package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 健康信息
 *
 * @author 
 * @email
 */
@TableName("jiankangxinxi")
public class JiankangxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiankangxinxiEntity() {

	}

	public JiankangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 体温
     */
    @TableField(value = "jiankangxinxi_tiwen")

    private Double jiankangxinxiTiwen;


    /**
     * 是否发烧
     */
    @TableField(value = "fashao_types")

    private Integer fashaoTypes;


    /**
     * 是否去过高风险地区
     */
    @TableField(value = "gaofengxian_types")

    private Integer gaofengxianTypes;


    /**
     * 旅居史
     */
    @TableField(value = "jiankangxinxi_address")

    private String jiankangxinxiAddress;


    /**
     * 健康码
     */
    @TableField(value = "jiankangxinxi_photo")

    private String jiankangxinxiPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：体温
	 */
    public Double getJiankangxinxiTiwen() {
        return jiankangxinxiTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setJiankangxinxiTiwen(Double jiankangxinxiTiwen) {
        this.jiankangxinxiTiwen = jiankangxinxiTiwen;
    }
    /**
	 * 设置：是否发烧
	 */
    public Integer getFashaoTypes() {
        return fashaoTypes;
    }


    /**
	 * 获取：是否发烧
	 */

    public void setFashaoTypes(Integer fashaoTypes) {
        this.fashaoTypes = fashaoTypes;
    }
    /**
	 * 设置：是否去过高风险地区
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 获取：是否去过高风险地区
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 设置：旅居史
	 */
    public String getJiankangxinxiAddress() {
        return jiankangxinxiAddress;
    }


    /**
	 * 获取：旅居史
	 */

    public void setJiankangxinxiAddress(String jiankangxinxiAddress) {
        this.jiankangxinxiAddress = jiankangxinxiAddress;
    }
    /**
	 * 设置：健康码
	 */
    public String getJiankangxinxiPhoto() {
        return jiankangxinxiPhoto;
    }


    /**
	 * 获取：健康码
	 */

    public void setJiankangxinxiPhoto(String jiankangxinxiPhoto) {
        this.jiankangxinxiPhoto = jiankangxinxiPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiankangxinxi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiankangxinxiTiwen=" + jiankangxinxiTiwen +
            ", fashaoTypes=" + fashaoTypes +
            ", gaofengxianTypes=" + gaofengxianTypes +
            ", jiankangxinxiAddress=" + jiankangxinxiAddress +
            ", jiankangxinxiPhoto=" + jiankangxinxiPhoto +
            ", createTime=" + createTime +
        "}";
    }
}
