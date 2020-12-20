package com.kgc.financingproduct.user;

import com.kgc.FinancingProduct.bean.Financingproduct;
import com.kgc.FinancingProduct.service.FinancingproductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class FinancingproductUserServiceApplicationTests {
@Resource
	FinancingproductService financingproductService;
	@Test
	void contextLoads() {
		List<Financingproduct> financingproducts = financingproductService.selectByExample("104448", 2);
		for (Financingproduct financingproduct : financingproducts) {
			System.out.println(financingproduct.getId());
		}
	}

}
