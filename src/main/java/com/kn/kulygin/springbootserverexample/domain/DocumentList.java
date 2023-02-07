package com.kn.kulygin.springbootserverexample.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DocumentList {

    public static final List<String> DOCUMENT_CODES
            = Arrays.asList("521",
            "L54",
            "L01",
            "L18",
            "L05",
            "746");

    public static final List<Document> DOCUMENTS
            = Arrays.asList(new Document(1L, "521"),
            new Document(2L, "L54"),
            new Document(3L, "L01"),
            new Document(4L, "L18"),
            new Document(5L, "L05"),
            new Document(6L, "746"));

}
