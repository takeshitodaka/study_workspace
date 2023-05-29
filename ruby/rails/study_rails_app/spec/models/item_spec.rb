require 'rails_helper'

# Itemモデルに対するテスト
RSpec.describe Item, type: :model do
  # デフォルトでできるやつコメントアウト
  # pending "add some examples to (or delete) #{__FILE__}"
  # 紐づく先のTodoが1つだけなテスト（１：多のテスト）
  it { should belong_to(:todo) }
  # nameあるよねのテスト
  it { should validate_presence_of(:name) }
end
