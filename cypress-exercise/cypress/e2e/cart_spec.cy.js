describe('Cart & Product Test (Gio hang & San pham)', () => {
  // Chạy trước mỗi bài test: Đăng nhập
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
  });

  // Kịch bản 3: Thêm sản phẩm vào giỏ
  it('Should add a product to the cart', () => {
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    // Kiểm tra giỏ hàng hiện số 1
    cy.get('.shopping_cart_badge').should('have.text', '1');
  });

  // Kịch bản 4: Lọc sản phẩm giá thấp -> cao
  it('Should sort products by price low to high', () => {
    cy.get('.product_sort_container').select('lohi');
    // Kiểm tra giá sản phẩm đầu tiên là $7.99
    cy.get('.inventory_item_price').first().should('have.text', '$7.99');
  });

  // --- BÀI TẬP NÂNG CAO ---

  // Kịch bản 5: Xóa sản phẩm khỏi giỏ
  it('Should remove a product from the cart', () => {
    // Thêm vào
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_badge').should('have.text', '1');
    
    // Xóa đi (Nút Add to cart giờ thành Remove)
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    
    // Kiểm tra số lượng biến mất
    cy.get('.shopping_cart_badge').should('not.exist');
  });

  // Kịch bản 6: Quy trình thanh toán (Checkout)
  it('Should proceed to checkout successfully', () => {
    // 1. Thêm hàng
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    // 2. Vào giỏ
    cy.get('.shopping_cart_link').click();
    // 3. Bấm Checkout
    cy.get('#checkout').click();
    
    // 4. Điền thông tin
    cy.get('#first-name').type('Phan');
    cy.get('#last-name').type('Hoang Anh');
    cy.get('#postal-code').type('12345');
    
    // 5. Tiếp tục
    cy.get('#continue').click();
    
    // 6. Kiểm tra đã sang trang bước 2
    cy.url().should('include', '/checkout-step-two.html');
  });
});