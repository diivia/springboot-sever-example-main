package com.kn.kulygin.springbootserverexample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "text_key")
public class TextKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "additional_info")
    private String additionalInfo;

    @Column(name = "document_types")
    private String documentTypes;

    @Column(name = "business_functions")
    private String businessFunctions;

    @Column(name = "network_types")
    private String networkTypes;

    @Column(name = "is_available_for_printing")
    private boolean isAvailableForPrinting;

    @Column(name = "is_imported")
    private boolean isImported;

    @Column(name = "company_code")
    private String companyCode;
}
