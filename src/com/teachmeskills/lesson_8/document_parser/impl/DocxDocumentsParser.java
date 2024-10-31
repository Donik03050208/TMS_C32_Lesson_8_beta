package com.teachmeskills.lesson_8.document_parser.impl;

import com.teachmeskills.lesson_8.document_parser.IParser;

public class DocxDocumentsParser implements IParser {
    public void parseFile(String fileName) {
        System.out.println("To parse docx:" + fileName);
    }
}