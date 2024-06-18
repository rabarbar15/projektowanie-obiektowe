//
//  File.swift
//  
//
//  Created by Kamil Piskorz on 09/06/2024.
//
import Fluent
import Foundation

final class Product: Model, @unchecked Sendable {
    static let schema = "products"
    
    @ID(key: .id)
    var id: UUID?
    
    @Field(key: "title")
    var title: String
    
    @Field(key: "price")
    var price: Int
    
    init() { }
    
    init(id: UUID? = nil, title: String, price: Int) {
        self.id = id
        self.title = title
        self.price = price
    }
    
    func toDTO() -> ProductDTO {
        .init(
            id: self.id,
            title: self.title,
            price: self.price
        )
    }
}
