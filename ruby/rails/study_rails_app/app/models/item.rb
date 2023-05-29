class Item < ApplicationRecord
  # 親モデル（参照先モデル）の定義
  belongs_to :todo


  # validation
  # 必須項目のバリデーション
  validates_presence_of :name
end
