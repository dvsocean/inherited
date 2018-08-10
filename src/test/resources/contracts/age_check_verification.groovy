package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return price of item"

    request {
        url "/item/0"
        method GET()
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
        body (
                price: 50
        )
    }
}


