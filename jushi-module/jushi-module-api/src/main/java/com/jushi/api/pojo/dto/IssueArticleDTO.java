package com.jushi.api.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssueArticleDTO implements Serializable {

    /**
     * 板块id
     */
   private String plateid;
      /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 文章内容是否有图片
     */
    private Boolean isImage;
    /**
     * 是否公开
     */
   private Boolean isPublic;


}
