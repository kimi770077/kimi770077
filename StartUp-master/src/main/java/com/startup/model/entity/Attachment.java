package com.startup.model.entity;

import com.startup.model.entity.base.BaseEntity;
import com.startup.model.entity.enumeration.AttachmentFileType;
import com.startup.model.entity.enumeration.AttachmentType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "attachmentEntity")
@Table(name = "t_attchment")
public class Attachment extends BaseEntity {
    @Column(name = "c_tableid")
    private long tableId;

    @Column(name = "c_recordid")
    private long recordId;

    @Column(name = "c_filetype")
    @Enumerated(EnumType.STRING)
    private AttachmentFileType fileType;

    @Column(name = "c_type")
    @Enumerated(EnumType.STRING)
    private AttachmentType type;

    @Column(name = "c_title")
    private String title;

    @Column(name = "c_description")
    private String description;

    @Column(name = "c_path")
    private String path;

}
