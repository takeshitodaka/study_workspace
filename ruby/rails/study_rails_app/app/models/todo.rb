class Todo < ApplicationRecord
    # model association
    # itemモデルと1:多の関係、親となるtodoを削除するときに紐づく子供itemも共連れで削除
    has_many :items, dependent: :destroy

    # validations
    # 必須バリデーション
    validates_presence_of :title, :created_by
end
