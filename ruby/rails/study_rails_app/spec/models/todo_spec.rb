require 'rails_helper'
# Todoモデルに対するテスト
RSpec.describe Todo, type: :model do
  # デフォでできるやつコメントアウト
  # pending "add some examples to (or delete) #{__FILE__}"

  # Todo:Itemが1:多の関係性であるかのテスト
  it { should have_many(:items).dependent(:destroy) }

  # タイトルがあるかのテスト
  it { should validate_presence_of(:title) }

  # 作成日時があるかのテスト
  it { should validate_presence_of(:created_by) }

end
