//
//  File.swift
//  
//
//  Created by Kamil Piskorz on 09/06/2024.
//

import Fluent
import Vapor

struct ProductDTO: Content {
    var id: UUID?
    var title: String
    var price: Int
    
    func toModel() -> Product {
        return Product(id: self.id, title: self.title, price: self.price)
    }
}
