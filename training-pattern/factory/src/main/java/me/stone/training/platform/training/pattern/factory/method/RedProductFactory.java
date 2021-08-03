package me.stone.training.platform.training.pattern.factory.method;

import me.stone.training.platform.training.pattern.factory.Product;
import me.stone.training.platform.training.pattern.factory.ProductFactory;
import me.stone.training.platform.training.pattern.factory.RedProduct;

/**
 * @author honorStone
 * @version 1.0
 * @email honor_stone@163.com
 * @desc description
 * @since 2021/8/2 22:46
 */
public class RedProductFactory implements ProductFactory {
    @Override
    public Product create() {
        return new RedProduct();
    }
}
