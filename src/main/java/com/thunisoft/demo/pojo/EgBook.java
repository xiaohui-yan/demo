package com.thunisoft.demo.pojo;

import javax.validation.constraints.NotBlank;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import java.math.BigDecimal;
import javax.validation.constraints.Digits;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
import java.util.Date;
import com.thunisoft.artery.data.annotation.CodeType;
/**
 * 
 * EgBook
 *
 * @description 
 * @author artery6一键生成
 * @author huayu
 * @date 2019年09月12日 18:39
 * @version 1.0
 */
@Table(name="{db.t_eg_book}")
public class EgBook  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** uuid */
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 图书名称 */
    @NotBlank
    @Size(max=300)
    @Column(name="c_name")
    private String name;

    /** 作者 */
    @Size(max=300)
    @Column(name="c_auth")
    private String auth;

    /** 出版日期 */
    @Column(name="d_publisher")
    private Date publisher;

    /** 单价 */
    @Digits(integer=6,fraction=2)
    @Column(name="f_price")
    private BigDecimal price;

    /** 购买日期 */
    @Column(name="d_buy")
    private Date buy;

    /** 图书室id */
    @NotBlank
    @Size(max=32)
    @Column(name="c_libraryid")
    private String libraryid;

    /** ISBN */
    @Size(max=300)
    @Column(name="c_isbn")
    private String isbn;

    /** 第几版 */
    @Size(max=300)
    @Column(name="c_version")
    private String version;

    /** 图书封面 */
    @Column(name="i_photo")
    private byte[] photo;

    /** 摘要 */
    @Column(name="t_abst")
    private String abst;

    /** 是否有效 */
    @CodeType("-1")
    @Column(name="n_valid")
    private Integer valid;

    /** 删除此图书的原因 */
    @Column(name="t_invalidreason")
    private String invalidreason;

    /** 类别 */
    @CodeType("-600")
    @Column(name="n_type")
    private Integer type;

    /** 附件 */
    @Column(name="i_attach")
    private byte[] attach;

    /** 预订时间 */
    @Column(name="d_booking")
    private Date booking;

    /** 预订人 */
    @Digits(integer=17,fraction=2)
    @Column(name="n_bookinguserid")
    private BigDecimal bookinguserid;

    /** 借出用户 */
    @Digits(integer=17,fraction=2)
    @Column(name="n_lenduserid")
    private BigDecimal lenduserid;

    /** 借出人 */
    @Column(name="d_lend")
    private Date lend;


    /**
     * 获取 c_id
     *
     * @return uuid
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id uuid
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_name
     *
     * @return 图书名称
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 图书名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 c_auth
     *
     * @return 作者
     */
    @JSONField(name = "auth") 
    public String getAuth() {
        return auth;
    }

    /**
     * 设置 c_auth
     *
     * @param auth 作者
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }
    /**
     * 获取 d_publisher
     *
     * @return 出版日期
     */
    @JSONField(name = "publisher") 
    public Date getPublisher() {
        return publisher;
    }

    /**
     * 设置 d_publisher
     *
     * @param publisher 出版日期
     */
    public void setPublisher(Date publisher) {
        this.publisher = publisher;
    }
    /**
     * 获取 f_price
     *
     * @return 单价
     */
    @JSONField(name = "price") 
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置 f_price
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    /**
     * 获取 d_buy
     *
     * @return 购买日期
     */
    @JSONField(name = "buy") 
    public Date getBuy() {
        return buy;
    }

    /**
     * 设置 d_buy
     *
     * @param buy 购买日期
     */
    public void setBuy(Date buy) {
        this.buy = buy;
    }
    /**
     * 获取 c_libraryid
     *
     * @return 图书室id
     */
    @JSONField(name = "libraryid") 
    public String getLibraryid() {
        return libraryid;
    }

    /**
     * 设置 c_libraryid
     *
     * @param libraryid 图书室id
     */
    public void setLibraryid(String libraryid) {
        this.libraryid = libraryid;
    }
    /**
     * 获取 c_isbn
     *
     * @return ISBN
     */
    @JSONField(name = "isbn") 
    public String getIsbn() {
        return isbn;
    }

    /**
     * 设置 c_isbn
     *
     * @param isbn ISBN
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * 获取 c_version
     *
     * @return 第几版
     */
    @JSONField(name = "version") 
    public String getVersion() {
        return version;
    }

    /**
     * 设置 c_version
     *
     * @param version 第几版
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * 获取 i_photo
     *
     * @return 图书封面
     */
    @JSONField(name = "photo") 
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * 设置 i_photo
     *
     * @param photo 图书封面
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    /**
     * 获取 t_abst
     *
     * @return 摘要
     */
    @JSONField(name = "abst") 
    public String getAbst() {
        return abst;
    }

    /**
     * 设置 t_abst
     *
     * @param abst 摘要
     */
    public void setAbst(String abst) {
        this.abst = abst;
    }
    /**
     * 获取 n_valid
     *
     * @return 是否有效
     */
    @JSONField(name = "valid") 
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置 n_valid
     *
     * @param valid 是否有效
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }
    /**
     * 获取 t_invalidreason
     *
     * @return 删除此图书的原因
     */
    @JSONField(name = "invalidreason") 
    public String getInvalidreason() {
        return invalidreason;
    }

    /**
     * 设置 t_invalidreason
     *
     * @param invalidreason 删除此图书的原因
     */
    public void setInvalidreason(String invalidreason) {
        this.invalidreason = invalidreason;
    }
    /**
     * 获取 n_type
     *
     * @return 类别
     */
    @JSONField(name = "type") 
    public Integer getType() {
        return type;
    }

    /**
     * 设置 n_type
     *
     * @param type 类别
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 获取 i_attach
     *
     * @return 附件
     */
    @JSONField(name = "attach") 
    public byte[] getAttach() {
        return attach;
    }

    /**
     * 设置 i_attach
     *
     * @param attach 附件
     */
    public void setAttach(byte[] attach) {
        this.attach = attach;
    }
    /**
     * 获取 d_booking
     *
     * @return 预订时间
     */
    @JSONField(name = "booking") 
    public Date getBooking() {
        return booking;
    }

    /**
     * 设置 d_booking
     *
     * @param booking 预订时间
     */
    public void setBooking(Date booking) {
        this.booking = booking;
    }
    /**
     * 获取 n_bookinguserid
     *
     * @return 预订人
     */
    @JSONField(name = "bookinguserid") 
    public BigDecimal getBookinguserid() {
        return bookinguserid;
    }

    /**
     * 设置 n_bookinguserid
     *
     * @param bookinguserid 预订人
     */
    public void setBookinguserid(BigDecimal bookinguserid) {
        this.bookinguserid = bookinguserid;
    }
    /**
     * 获取 n_lenduserid
     *
     * @return 借出用户
     */
    @JSONField(name = "lenduserid") 
    public BigDecimal getLenduserid() {
        return lenduserid;
    }

    /**
     * 设置 n_lenduserid
     *
     * @param lenduserid 借出用户
     */
    public void setLenduserid(BigDecimal lenduserid) {
        this.lenduserid = lenduserid;
    }
    /**
     * 获取 d_lend
     *
     * @return 借出人
     */
    @JSONField(name = "lend") 
    public Date getLend() {
        return lend;
    }

    /**
     * 设置 d_lend
     *
     * @param lend 借出人
     */
    public void setLend(Date lend) {
        this.lend = lend;
    }

}
